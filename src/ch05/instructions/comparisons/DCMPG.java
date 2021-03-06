package ch05.instructions.comparisons;

import ch05.instructions.Instruction;
import ch05.instructions.base.BytecodeReader;
import ch05.rtda.Frame;
import ch05.rtda.OperandStack;

public class DCMPG implements Instruction {
    @Override
    public void FetchOperands(BytecodeReader reader) {

    }

    @Override
    public void Execute(Frame frame) {
        fcmp(frame,true);
    }

    public void fcmp(Frame frame,boolean gFlag) {
        OperandStack stack = frame.operandStack;
        double v2 = stack.popDouble();
        double v1 = stack.popDouble();
        if (v1 > v2) {
            stack.pushInt(1);
        } else if (v1 == v2) {
            stack.pushInt(0);
        }else if (v1 < v2){
            stack.pushInt(-1);
        } else if(gFlag){
            stack.pushInt(1);
        } else {
            stack.pushInt(-1);
        }
    }
}
