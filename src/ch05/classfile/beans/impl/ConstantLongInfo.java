package ch05.classfile.beans.impl;

import ch05.classfile.ClassReader;
import ch05.classfile.beans.ConstantInfo;

public class ConstantLongInfo extends ConstantInfo {
    public int tag;
    public long bytes;
    public long val;

    @Override
    /**
     *  readInfo先读取一个uint32数据，然后把它转型成int32类型
     */
    public void readInfo(ClassReader reader) {
        this.bytes = reader.readUnit64();
        this.val = bytes;
    }
}
