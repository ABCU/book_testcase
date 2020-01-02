```shell script
$ javap -verbose AbstractTestClass.class

Classfile /F:/Github/book_testcase/src/org/fenixsoft/jvm/chapter6/AbstractTestClass.class
  Last modified 2020-1-1; size 302 bytes
  MD5 checksum 8f7770c4c79dafe1362cf82ec271bae1
  Compiled from "AbstractTestClass.java"
public abstract class org.fenixsoft.jvm.chapter6.AbstractTestClass
  minor version: 0
  major version: 52
  flags: ACC_PUBLIC, ACC_SUPER, ACC_ABSTRACT
Constant pool:
   #1 = Methodref          #3.#12         // java/lang/Object."<init>":()V
   #2 = Class              #13            // org/fenixsoft/jvm/chapter6/AbstractTestClass
   #3 = Class              #14            // java/lang/Object
   #4 = Utf8               <init>
   #5 = Utf8               ()V
   #6 = Utf8               Code
   #7 = Utf8               LineNumberTable
   #8 = Utf8               method1
   #9 = Utf8               method2
  #10 = Utf8               SourceFile
  #11 = Utf8               AbstractTestClass.java
  #12 = NameAndType        #4:#5          // "<init>":()V
  #13 = Utf8               org/fenixsoft/jvm/chapter6/AbstractTestClass
  #14 = Utf8               java/lang/Object
{
  public org.fenixsoft.jvm.chapter6.AbstractTestClass();
    descriptor: ()V
    flags: ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 3: 0

  protected void method1();
    descriptor: ()V
    flags: ACC_PROTECTED
    Code:
      stack=0, locals=1, args_size=1
         0: return
      LineNumberTable:
        line 5: 0

  abstract void method2();
    descriptor: ()V
    flags: ACC_ABSTRACT
}
SourceFile: "AbstractTestClass.java"

```

jdk11
```shell script
$ F:\OpenJDK\bin\jdk-11.0.5\bin\javap -verbose AbstractTestClass.class

Classfile /F:/Github/book_testcase/src/org/fenixsoft/jvm/chapter6/AbstractTestClass.class
  Last modified 2020年1月1日; size 302 bytes
  MD5 checksum 5d1ad84e46dbea1d664f8d289f069198
  Compiled from "AbstractTestClass.java"
public abstract class org.fenixsoft.jvm.chapter6.AbstractTestClass
  minor version: 0
  major version: 55
  flags: (0x0421) ACC_PUBLIC, ACC_SUPER, ACC_ABSTRACT
  this_class: #2                          // org/fenixsoft/jvm/chapter6/AbstractTestClass
  super_class: #3                         // java/lang/Object
  interfaces: 0, fields: 0, methods: 3, attributes: 1
Constant pool:
   #1 = Methodref          #3.#12         // java/lang/Object."<init>":()V
   #2 = Class              #13            // org/fenixsoft/jvm/chapter6/AbstractTestClass
   #3 = Class              #14            // java/lang/Object
   #4 = Utf8               <init>
   #5 = Utf8               ()V
   #6 = Utf8               Code
   #7 = Utf8               LineNumberTable
   #8 = Utf8               method1
   #9 = Utf8               method2
  #10 = Utf8               SourceFile
  #11 = Utf8               AbstractTestClass.java
  #12 = NameAndType        #4:#5          // "<init>":()V
  #13 = Utf8               org/fenixsoft/jvm/chapter6/AbstractTestClass
  #14 = Utf8               java/lang/Object
{
  public org.fenixsoft.jvm.chapter6.AbstractTestClass();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 3: 0

  protected void method1();
    descriptor: ()V
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=0, locals=1, args_size=1
         0: return
      LineNumberTable:
        line 5: 0

  abstract void method2();
    descriptor: ()V
    flags: (0x0400) ACC_ABSTRACT
}
SourceFile: "AbstractTestClass.java"

```