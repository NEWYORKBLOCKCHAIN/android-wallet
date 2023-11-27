package com.alphawallet.app.entity;
/**
 * Created by MikodesTeam
 * 07/06/2022.
 */
public class FileData
{
    public Long fileDate;
    public String fileName;
    public boolean modified;

    public FileData()
    {
        fileDate = 0L;
        fileName = "";
        modified = false;
    }
}