package com.gxk.jvm.instruction.math;

import com.gxk.jvm.instruction.Instruction;


import com.gxk.jvm.rtda.Frame;

public class IXOrInst implements Instruction {

  @Override
  public void execute(Frame frame) {
    final int v2 = frame.popInt();
    final int v1 = frame.popInt();
    frame.pushInt(v1 ^ v2);
  }
}