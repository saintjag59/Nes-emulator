package com.grapeshot.halfnes;


import com.sun.nio.zipfs.ZipDirectoryStream;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/**
 * Created by Константин on 18.01.2015.
 */
public class FileUtil {

    public static File[] getFileList(String path){
        File[] fileList = new File(path).listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                String str = pathname.getName().toLowerCase();
                if (str.endsWith(".nes") || str.endsWith(".zip"))return true;
                else return false;
            }
        });

        return fileList;
    }
}
