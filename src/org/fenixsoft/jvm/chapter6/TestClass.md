## Hex
 ```cmd

```
## Javap
```shell script
$ javap -verbose TestClass.class

Classfile /F:/Github/book_testcase/src/org/fenixsoft/jvm/chapter6/TestClass.class
  Last modified 2019-12-31; size 307 bytes
  MD5 checksum b43e9f9f1c48b55694572ed9fd631bf1
  Compiled from "TestClass.java"
public class org.fenixsoft.jvm.chapter6.TestClass
  minor version: 0
  major version: 52
  flags: ACC_PUBLIC, ACC_SUPER
Constant pool:
   #1 = Methodref          #4.#15         // java/lang/Object."<init>":()V
   #2 = Fieldref           #3.#16         // org/fenixsoft/jvm/chapter6/TestClass.m:I
   #3 = Class              #17            // org/fenixsoft/jvm/chapter6/TestClass
   #4 = Class              #18            // java/lang/Object
   #5 = Utf8               m
   #6 = Utf8               I
   #7 = Utf8               <init>
   #8 = Utf8               ()V
   #9 = Utf8               Code
  #10 = Utf8               LineNumberTable
  #11 = Utf8               increase
  #12 = Utf8               ()I
  #13 = Utf8               SourceFile
  #14 = Utf8               TestClass.java
  #15 = NameAndType        #7:#8          // "<init>":()V
  #16 = NameAndType        #5:#6          // m:I
  #17 = Utf8               org/fenixsoft/jvm/chapter6/TestClass
  #18 = Utf8               java/lang/Object
{
  public org.fenixsoft.jvm.chapter6.TestClass();
    descriptor: ()V
    flags: ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 3: 0

  public int increase();
    descriptor: ()I
    flags: ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #2                  // Field m:I
         4: iconst_1
         5: iadd
         6: ireturn
      LineNumberTable:
        line 7: 0
}
SourceFile: "TestClass.java"

```