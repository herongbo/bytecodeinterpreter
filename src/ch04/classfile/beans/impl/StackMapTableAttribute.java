package ch04.classfile.beans.impl;

import ch04.classfile.ClassReader;
import ch04.classfile.beans.AttributeInfo;

public class StackMapTableAttribute extends AttributeInfo {

    int attributeNameIndex;
    int attributeLength;
    int numberOfEntries;

    public StackMapTableAttribute(int attributeLength){
        this.attributeLength = attributeLength;
    }

    @Override
    public void readInfo(ClassReader reader){
        this.numberOfEntries = (int)reader.readUint16();
        reader.readBytes(this.attributeLength - this.numberOfEntries);
    }
}
