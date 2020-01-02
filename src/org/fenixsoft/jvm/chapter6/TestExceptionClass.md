```shell script
$ F:\OpenJDK\bin\jdk-11.0.5\bin\javap -verbose TestExceptionClass.class

Classfile /F:/Github/book_testcase/src/org/fenixsoft/jvm/chapter6/TestExceptionClass.class
  Last modified 2020年1月1日; size 682 bytes
  MD5 checksum 63d14cefd13d1d72c203829aada7d1a9
  Compiled from "TestExceptionClass.java"
public class org.fenixsoft.jvm.chapter6.TestExceptionClass
  minor version: 0
  major version: 55
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #6                          // org/fenixsoft/jvm/chapter6/TestExceptionClass
  super_class: #7                         // java/lang/Object
  interfaces: 0, fields: 4, methods: 4, attributes: 1
Constant pool:
   #1 = Methodref          #7.#27         // java/lang/Object."<init>":()V
   #2 = Fieldref           #6.#28         // org/fenixsoft/jvm/chapter6/TestExceptionClass.m:I
   #3 = Fieldref           #6.#29         // org/fenixsoft/jvm/chapter6/TestExceptionClass.j:I
   #4 = Class              #30            // java/lang/Exception
   #5 = Methodref          #4.#31         // java/lang/Exception.fillInStackTrace:()Ljava/lang/Throwable;
   #6 = Class              #32            // org/fenixsoft/jvm/chapter6/TestExceptionClass
   #7 = Class              #33            // java/lang/Object
   #8 = Utf8               i
   #9 = Utf8               I
  #10 = Utf8               j
  #11 = Utf8               m
  #12 = Utf8               ConstantValue
  #13 = Integer            2
  #14 = Utf8               n
  #15 = Integer            3
  #16 = Utf8               <init>
  #17 = Utf8               ()V
  #18 = Utf8               Code
  #19 = Utf8               LineNumberTable
  #20 = Utf8               method
  #21 = Utf8               increase
  #22 = Utf8               (I)I
  #23 = Utf8               StackMapTable
  #24 = Utf8               <clinit>
  #25 = Utf8               SourceFile
  #26 = Utf8               TestExceptionClass.java
  #27 = NameAndType        #16:#17        // "<init>":()V
  #28 = NameAndType        #11:#9         // m:I
  #29 = NameAndType        #10:#9         // j:I
  #30 = Utf8               java/lang/Exception
  #31 = NameAndType        #34:#35        // fillInStackTrace:()Ljava/lang/Throwable;
  #32 = Utf8               org/fenixsoft/jvm/chapter6/TestExceptionClass
  #33 = Utf8               java/lang/Object
  #34 = Utf8               fillInStackTrace
  #35 = Utf8               ()Ljava/lang/Throwable;
{
  public org.fenixsoft.jvm.chapter6.TestExceptionClass();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: iconst_2
         6: putfield      #2                  // Field m:I
         9: return
      LineNumberTable:
        line 3: 0
        line 6: 4

  public void method();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=0, locals=1, args_size=1
         0: return
      LineNumberTable:
        line 10: 0

  public static int increase(int);
    descriptor: (I)I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=3, args_size=1
         0: iconst_0
         1: istore_1
         2: getstatic     #3                  // Field j:I
         5: iload_0
         6: iadd
         7: istore_1
         8: goto          17
        11: astore_2
        12: aload_2
        13: invokevirtual #5                  // Method java/lang/Exception.fillInStackTrace:()Ljava/lang/Throwable;
        16: pop
        17: iload_1
        18: ireturn
      Exception table:
         from    to  target type
             2     8    11   Class java/lang/Exception
      LineNumberTable:
        line 14: 0
        line 16: 2
        line 19: 8
        line 17: 11
        line 18: 12
        line 20: 17
      StackMapTable: number_of_entries = 2
        frame_type = 255 /* full_frame */
          offset_delta = 11
          locals = [ int, int ]
          stack = [ class java/lang/Exception ]
        frame_type = 5 /* same */

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: iconst_1
         1: putstatic     #3                  // Field j:I
         4: return
      LineNumberTable:
        line 5: 0
}
SourceFile: "TestExceptionClass.java"

```

with finally block
```shell script
Classfile /F:/Github/book_testcase/src/org/fenixsoft/jvm/chapter6/TestExceptionClass.class
  Last modified 2020年1月1日; size 921 bytes
  MD5 checksum 736fb6f0a538abc9f2bfa591ee6f6b29
  Compiled from "TestExceptionClass.java"
public class org.fenixsoft.jvm.chapter6.TestExceptionClass
  minor version: 0
  major version: 55
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #9                          // org/fenixsoft/jvm/chapter6/TestExceptionClass
  super_class: #10                        // java/lang/Object
  interfaces: 0, fields: 4, methods: 4, attributes: 1
Constant pool:
   #1 = Methodref          #10.#31        // java/lang/Object."<init>":()V
   #2 = Fieldref           #9.#32         // org/fenixsoft/jvm/chapter6/TestExceptionClass.m:I
   #3 = Fieldref           #9.#33         // org/fenixsoft/jvm/chapter6/TestExceptionClass.j:I
   #4 = Fieldref           #34.#35        // java/lang/System.out:Ljava/io/PrintStream;
   #5 = String             #36            // finally
   #6 = Methodref          #37.#38        // java/io/PrintStream.println:(Ljava/lang/String;)V
   #7 = Class              #39            // java/lang/Exception
   #8 = Methodref          #7.#40         // java/lang/Exception.fillInStackTrace:()Ljava/lang/Throwable;
   #9 = Class              #41            // org/fenixsoft/jvm/chapter6/TestExceptionClass
  #10 = Class              #42            // java/lang/Object
  #11 = Utf8               i
  #12 = Utf8               I
  #13 = Utf8               j
  #14 = Utf8               m
  #15 = Utf8               ConstantValue
  #16 = Integer            2
  #17 = Utf8               n
  #18 = Integer            3
  #19 = Utf8               <init>
  #20 = Utf8               ()V
  #21 = Utf8               Code
  #22 = Utf8               LineNumberTable
  #23 = Utf8               method
  #24 = Utf8               increase
  #25 = Utf8               (I)I
  #26 = Utf8               StackMapTable
  #27 = Class              #43            // java/lang/Throwable
  #28 = Utf8               <clinit>
  #29 = Utf8               SourceFile
  #30 = Utf8               TestExceptionClass.java
  #31 = NameAndType        #19:#20        // "<init>":()V
  #32 = NameAndType        #14:#12        // m:I
  #33 = NameAndType        #13:#12        // j:I
  #34 = Class              #44            // java/lang/System
  #35 = NameAndType        #45:#46        // out:Ljava/io/PrintStream;
  #36 = Utf8               finally
  #37 = Class              #47            // java/io/PrintStream
  #38 = NameAndType        #48:#49        // println:(Ljava/lang/String;)V
  #39 = Utf8               java/lang/Exception
  #40 = NameAndType        #50:#51        // fillInStackTrace:()Ljava/lang/Throwable;
  #41 = Utf8               org/fenixsoft/jvm/chapter6/TestExceptionClass
  #42 = Utf8               java/lang/Object
  #43 = Utf8               java/lang/Throwable
  #44 = Utf8               java/lang/System
  #45 = Utf8               out
  #46 = Utf8               Ljava/io/PrintStream;
  #47 = Utf8               java/io/PrintStream
  #48 = Utf8               println
  #49 = Utf8               (Ljava/lang/String;)V
  #50 = Utf8               fillInStackTrace
  #51 = Utf8               ()Ljava/lang/Throwable;
{
  public org.fenixsoft.jvm.chapter6.TestExceptionClass();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_0
         5: iconst_2
         6: putfield      #2                  // Field m:I
         9: return
      LineNumberTable:
        line 3: 0
        line 6: 4

  public void method();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=0, locals=1, args_size=1
         0: return
      LineNumberTable:
        line 10: 0

  public static int increase(int);
    descriptor: (I)I
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=4, args_size=1
         0: iconst_0
         1: istore_1
         2: getstatic     #3                  // Field j:I
         5: iload_0
         6: iadd
         7: istore_1
         8: getstatic     #4                  // Field java/lang/System.out:Ljava/io/PrintStream;
        11: ldc           #5                  // String finally
        13: invokevirtual #6                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
        16: goto          47
        19: astore_2
        20: aload_2
        21: invokevirtual #8                  // Method java/lang/Exception.fillInStackTrace:()Ljava/lang/Throwable;
        24: pop
        25: getstatic     #4                  // Field java/lang/System.out:Ljava/io/PrintStream;
        28: ldc           #5                  // String finally
        30: invokevirtual #6                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
        33: goto          47
        36: astore_3
        37: getstatic     #4                  // Field java/lang/System.out:Ljava/io/PrintStream;
        40: ldc           #5                  // String finally
        42: invokevirtual #6                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
        45: aload_3
        46: athrow
        47: iload_1
        48: ireturn
      Exception table:
         from    to  target type
             2     8    19   Class java/lang/Exception
             2     8    36   any
            19    25    36   any
      LineNumberTable:
        line 14: 0
        line 16: 2
        line 20: 8
        line 21: 16
        line 17: 19
        line 18: 20
        line 20: 25
        line 21: 33
        line 20: 36
        line 21: 45
        line 22: 47
      StackMapTable: number_of_entries = 3
        frame_type = 255 /* full_frame */
          offset_delta = 19
          locals = [ int, int ]
          stack = [ class java/lang/Exception ]
        frame_type = 80 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]
        frame_type = 10 /* same */

  static {};
    descriptor: ()V
    flags: (0x0008) ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: iconst_1
         1: putstatic     #3                  // Field j:I
         4: return
      LineNumberTable:
        line 5: 0
}
SourceFile: "TestExceptionClass.java"

```