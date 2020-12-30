package com.gxk.jvm.instruction.math;

import com.gxk.jvm.instruction.Instruction;


import com.gxk.jvm.rtda.Frame;

public class LUShrInst implements Instruction {

  @Override
  public void execute(Frame frame) {
    int v2 = frame.popInt();
    long v1 = frame.popLong();
    int s = v2 & 0x3f;

    if (v1 >= 0) {
      long ret = v1 >> s;
      frame.pushLong(ret);
      return;
    }
    long ret = (v1 >> s) + (2L << ~s);
    frame.pushLong(ret);
  }
}