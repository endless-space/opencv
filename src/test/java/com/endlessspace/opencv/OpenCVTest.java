package com.endlessspace.opencv;

import static org.bytedeco.javacpp.opencv_core.Mat;
import static org.bytedeco.javacpp.opencv_imgcodecs.imread;

import com.endlessspace.opencv.util.OpenCVs;
import org.junit.Test;

import java.io.IOException;

/**
 * Author: endlessspace
 * CreateDate: 2017/10/5
 * Description: 
 */
public class OpenCVTest {
  
  @Test
  public void testShowImage() throws IOException {
    Mat pic = imread("G:\\Temp\\ida.jpg");
    OpenCVs.imshow("original", pic);
    
    System.in.read();
  }
}
