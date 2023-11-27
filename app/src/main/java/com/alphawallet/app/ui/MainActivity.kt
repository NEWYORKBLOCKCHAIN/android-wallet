package com.alphawallet.app.ui

import android.animation.ValueAnimator
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.LinearInterpolator
import android.view.animation.RotateAnimation
import android.view.inputmethod.InputMethodManager
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.app.ActivityOptionsCompat
import com.alphawallet.app.R
import com.alphawallet.app.databinding.ActivityMainBinding
import com.deimos.openaiapi.OpenAI
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var SEND: Boolean = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val xxb: Int = binding.constraintLayoutchat.getLayoutParams().width


        val API_KEY =
                "Bearer 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" // Replace MY_API_KEY with your own key and keep the word Bearer
        val openAI = OpenAI(API_KEY)
        // You can change the prompt, this is what we find in the chat example from the OpenAI page
        var prompt =
            "The following is a conversation with an AI assistant. The assistant is helpful, creative, clever, and very friendly."

        binding.imageView2chat.visibility = View.GONE

        binding.constraintLayout3chat.setOnClickListener { v -> presentActivity(v) }

        binding.constraintLayout2chat.setOnClickListener {


            if (SEND) {
                binding.imageView2chat.setImageResource(R.drawable.rotate)
                val message = binding.etMessage.text.toString()
                deleteTVMessage()
                hideKeyboard()

                CoroutineScope(Dispatchers.IO).launch {
                    prompt += "\n\nHuman: $message \nAI:"

                    try {
                        val response = openAI.createCompletion(
                            model = "text-davinci-003",
                            prompt = prompt,
                            temperature = 0.9,
                            max_tokens = 150,
                            top_p = 1,
                            frequency_penalty = 0.0,
                            presence_penalty = 0.6,
                            stop = listOf(" Human:", " AI:")
                        )

                        if (response.isSuccessful) {
                            var answer = response.body()?.choices?.first()?.text
                            answer = answer?.trimStart() // Delete the first space from the answer
                            binding.imageView.setImageResource(R.drawable.cross)


                            runOnUiThread {
                                binding.tvResponse.text = answer
                                binding.imageView2chat.setImageResource(R.drawable.nothing)


                            }
                        } else {
                            Log.d("RESPONSE", "Error: ${response.code()} ${response.message()}")
                        }
                    } catch (e: Exception) {
                        Log.d("RESPONSE", "Error: $e")
                    }
                }
                val rotate = RotateAnimation(
                    0F,
                    980F,
                    Animation.RELATIVE_TO_SELF,
                    0.5f,
                    Animation.RELATIVE_TO_SELF,
                    0.5f
                )
                rotate.duration = 5200
                rotate.interpolator = LinearInterpolator()

                binding.imageView2chat.visibility = View.VISIBLE
                binding.imageView2chat.startAnimation(rotate)

                val xx: Int = binding.constraintLayoutchat.getLayoutParams().width
                val yy: Int = binding.constraintLayoutchat.getLayoutParams().height

                val anim = ValueAnimator.ofInt(xx, yy)
                anim.addUpdateListener { valueAnimator ->
                    val `val` = valueAnimator.animatedValue as Int
                    val layoutParams: ViewGroup.LayoutParams =
                        binding.constraintLayoutchat.getLayoutParams()
                    layoutParams.width = `val`
                    binding.constraintLayoutchat.setLayoutParams(layoutParams)
                }
                anim.duration = 600
                anim.start()
                Handler().postDelayed({
                    //  binding.imageView2.setImageResource(R.drawable.nothing)

                }, 1200)
                // binding.imageView2.setImageResource(R.drawable.nothing)

                SEND = false

            } else {


                val yy: Int = binding.constraintLayoutchat.getLayoutParams().height

                val anim2 = ValueAnimator.ofInt(yy, xxb)
                anim2.addUpdateListener { valueAnimator ->
                    val `val` = valueAnimator.animatedValue as Int
                    val layoutParams: ViewGroup.LayoutParams =
                        binding.constraintLayoutchat.getLayoutParams()
                    layoutParams.width = `val`
                    binding.constraintLayoutchat.setLayoutParams(layoutParams)
                }
                anim2.duration = 400
                anim2.start()

                binding.imageView.setImageResource(R.drawable.ic_send)

                SEND = true
            }

        }


        binding.tvResponse.setOnClickListener { hideKeyboard() }
    }

    private fun deleteTVMessage() {
        binding.etMessage.setText("")
    }
    fun presentActivity(view: View) {
        val options = ActivityOptionsCompat.makeSceneTransitionAnimation(this, view, "transition")
        val revealX = view.x + view.width / 2
        val revealY = view.y + view.height / 2


    }

    private fun hideKeyboard() {
        val activityView = this.window.decorView
        val imm =
            activityView.context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(activityView.windowToken, 0)
    }
}