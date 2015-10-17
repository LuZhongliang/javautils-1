package com.cenrise.commons.utils;

import java.io.File;

import org.junit.Test;

import com.cenrise.commons.utils.SysUtil;
import com.cenrise.commons.utils.ZIPUtil;

public class ZIPUtilTest extends SupportTest {

    @Test
    public void testDeCompress() throws Exception {
        String file    = SysUtil.CURRENT_USER_DIR + "/Junit/model";
        String zipFile = SysUtil.CURRENT_USER_DIR + "/Junit/Resource/temp/test.zip";
        ZIPUtil.deCompress(new File(file), zipFile);


    }

    @Test
    public void testUnCompress() throws Exception {
        String zipFile = SysUtil.CURRENT_USER_DIR + "/Junit/Resource/temp/test.zip";
        if (!(new File(zipFile).exists())) {
            testDeCompress();
        }
        ZIPUtil.unCompress(new File(zipFile), SysUtil.JVM_TEMPDIR);
    }
}