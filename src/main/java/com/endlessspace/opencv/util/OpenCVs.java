package com.endlessspace.opencv.util;

import org.bytedeco.javacpp.opencv_core;
import org.bytedeco.javacv.CanvasFrame;
import org.bytedeco.javacv.OpenCVFrameConverter;

import javax.swing.*;

/**
 * Author: endlessspace
 * CreateDate: 2017/10/5
 * Description: opencv utility
 */
public final class OpenCVs {
  
  private OpenCVs() {}
  
  public static void imshow(String txt, opencv_core.Mat img) {
    CanvasFrame canvasFrame = new CanvasFrame(txt);
    canvasFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    canvasFrame.setCanvasSize(img.cols(), img.rows());
    canvasFrame.showImage(new OpenCVFrameConverter.ToMat().convert(img));
  }
}
