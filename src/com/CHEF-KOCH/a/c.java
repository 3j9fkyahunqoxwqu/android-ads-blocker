package com.CHEF-KOCH.a;

public class c
{
  protected static String[] c = { "echo -BOC-", "id" };
  
  /* Error */
  public static java.util.List run(String paramString, String[] paramArrayOfString1, String[] paramArrayOfString2, boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: getstatic 29	java/util/Locale:ENGLISH	Ljava/util/Locale;
    //   4: invokevirtual 33	java/lang/String:toUpperCase	(Ljava/util/Locale;)Ljava/lang/String;
    //   7: astore 10
    //   9: invokestatic 39	com/CHEF-KOCH/a/Debug:getSanityChecksEnabledEffective	()Z
    //   12: ifeq +24 -> 36
    //   15: invokestatic 42	com/CHEF-KOCH/a/Debug:onMainThread	()Z
    //   18: ifeq +18 -> 36
    //   21: ldc 44
    //   23: invokestatic 48	com/CHEF-KOCH/a/Debug:log	(Ljava/lang/String;)V
    //   26: new 50	com/CHEF-KOCH/a/UnsupportedDataException
    //   29: dup
    //   30: ldc 44
    //   32: invokespecial 53	com/CHEF-KOCH/a/UnsupportedDataException:<init>	(Ljava/lang/String;)V
    //   35: athrow
    //   36: ldc 55
    //   38: iconst_1
    //   39: anewarray 4	java/lang/Object
    //   42: dup
    //   43: iconst_0
    //   44: aload 10
    //   46: aastore
    //   47: invokestatic 59	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   50: invokestatic 62	com/CHEF-KOCH/a/Debug:logCommand	(Ljava/lang/String;)V
    //   53: new 64	java/util/ArrayList
    //   56: dup
    //   57: invokespecial 66	java/util/ArrayList:<init>	()V
    //   60: invokestatic 72	java/util/Collections:synchronizedList	(Ljava/util/List;)Ljava/util/List;
    //   63: astore 8
    //   65: aload_2
    //   66: astore 9
    //   68: aload_2
    //   69: ifnull +81 -> 150
    //   72: new 74	java/util/HashMap
    //   75: dup
    //   76: invokespecial 75	java/util/HashMap:<init>	()V
    //   79: astore 11
    //   81: aload 11
    //   83: invokestatic 81	java/lang/System:getenv	()Ljava/util/Map;
    //   86: invokeinterface 87 2 0
    //   91: aload_2
    //   92: arraylength
    //   93: istore 5
    //   95: iconst_0
    //   96: istore 4
    //   98: iload 4
    //   100: iload 5
    //   102: if_icmplt +270 -> 372
    //   105: aload 11
    //   107: invokeinterface 91 1 0
    //   112: istore 4
    //   114: iload 4
    //   116: anewarray 10	java/lang/String
    //   119: astore 9
    //   121: aload 11
    //   123: invokeinterface 95 1 0
    //   128: invokeinterface 101 1 0
    //   133: astore_2
    //   134: iconst_0
    //   135: istore 4
    //   137: aload_2
    //   138: invokeinterface 106 1 0
    //   143: istore 7
    //   145: iload 7
    //   147: ifne +283 -> 430
    //   150: invokestatic 112	java/lang/Runtime:getRuntime	()Ljava/lang/Runtime;
    //   153: aload_0
    //   154: aload 9
    //   156: invokevirtual 116	java/lang/Runtime:exec	(Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/Process;
    //   159: astore 9
    //   161: new 118	java/io/DataOutputStream
    //   164: dup
    //   165: aload 9
    //   167: invokevirtual 124	java/lang/Process:getOutputStream	()Ljava/io/OutputStream;
    //   170: invokespecial 127	java/io/DataOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   173: astore 12
    //   175: new 129	com/CHEF-KOCH/a/b
    //   178: dup
    //   179: new 131	java/lang/StringBuilder
    //   182: dup
    //   183: aload 10
    //   185: invokestatic 135	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   188: invokespecial 136	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   191: ldc -118
    //   193: invokevirtual 142	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   196: invokevirtual 146	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   199: aload 9
    //   201: invokevirtual 150	java/lang/Process:getInputStream	()Ljava/io/InputStream;
    //   204: aload 8
    //   206: invokespecial 153	com/CHEF-KOCH/a/b:<init>	(Ljava/lang/String;Ljava/io/InputStream;Ljava/util/List;)V
    //   209: astore 11
    //   211: new 131	java/lang/StringBuilder
    //   214: dup
    //   215: aload 10
    //   217: invokestatic 135	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   220: invokespecial 136	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   223: ldc -101
    //   225: invokevirtual 142	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   228: invokevirtual 146	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   231: astore 13
    //   233: aload 9
    //   235: invokevirtual 158	java/lang/Process:getErrorStream	()Ljava/io/InputStream;
    //   238: astore 14
    //   240: iload_3
    //   241: ifeq +283 -> 524
    //   244: aload 8
    //   246: astore_2
    //   247: new 129	com/CHEF-KOCH/a/b
    //   250: dup
    //   251: aload 13
    //   253: aload 14
    //   255: aload_2
    //   256: invokespecial 153	com/CHEF-KOCH/a/b:<init>	(Ljava/lang/String;Ljava/io/InputStream;Ljava/util/List;)V
    //   259: astore_2
    //   260: aload 11
    //   262: invokevirtual 163	java/lang/Thread:start	()V
    //   265: aload_2
    //   266: invokevirtual 163	java/lang/Thread:start	()V
    //   269: aload_1
    //   270: arraylength
    //   271: istore 5
    //   273: iconst_0
    //   274: istore 4
    //   276: iload 4
    //   278: iload 5
    //   280: if_icmplt +249 -> 529
    //   283: aload 12
    //   285: ldc -91
    //   287: ldc -89
    //   289: invokevirtual 171	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   292: invokevirtual 175	java/io/DataOutputStream:write	([B)V
    //   295: aload 12
    //   297: invokevirtual 178	java/io/DataOutputStream:flush	()V
    //   300: aload 9
    //   302: invokevirtual 181	java/lang/Process:waitFor	()I
    //   305: pop
    //   306: aload 12
    //   308: invokevirtual 184	java/io/DataOutputStream:close	()V
    //   311: aload 11
    //   313: invokevirtual 187	java/lang/Thread:join	()V
    //   316: aload_2
    //   317: invokevirtual 187	java/lang/Thread:join	()V
    //   320: aload 9
    //   322: invokevirtual 190	java/lang/Process:destroy	()V
    //   325: aload_0
    //   326: invokestatic 196	com/CHEF-KOCH/a/Shell$SU:isSU	(Ljava/lang/String;)Z
    //   329: istore_3
    //   330: iload_3
    //   331: ifeq +290 -> 621
    //   334: aload 9
    //   336: invokevirtual 199	java/lang/Process:exitValue	()I
    //   339: istore 4
    //   341: iload 4
    //   343: ifeq +278 -> 621
    //   346: aconst_null
    //   347: astore_1
    //   348: ldc -55
    //   350: iconst_1
    //   351: anewarray 4	java/lang/Object
    //   354: dup
    //   355: iconst_0
    //   356: aload_0
    //   357: getstatic 29	java/util/Locale:ENGLISH	Ljava/util/Locale;
    //   360: invokevirtual 33	java/lang/String:toUpperCase	(Ljava/util/Locale;)Ljava/lang/String;
    //   363: aastore
    //   364: invokestatic 59	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   367: invokestatic 62	com/CHEF-KOCH/a/Debug:logCommand	(Ljava/lang/String;)V
    //   370: aload_1
    //   371: areturn
    //   372: aload_2
    //   373: iload 4
    //   375: aaload
    //   376: astore 9
    //   378: aload 9
    //   380: ldc -53
    //   382: invokevirtual 207	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   385: istore 6
    //   387: iload 6
    //   389: iflt +32 -> 421
    //   392: aload 9
    //   394: iconst_0
    //   395: iload 6
    //   397: invokevirtual 211	java/lang/String:substring	(II)Ljava/lang/String;
    //   400: astore 12
    //   402: aload 11
    //   404: aload 12
    //   406: aload 9
    //   408: iload 6
    //   410: iconst_1
    //   411: iadd
    //   412: invokevirtual 214	java/lang/String:substring	(I)Ljava/lang/String;
    //   415: invokeinterface 218 3 0
    //   420: pop
    //   421: iload 4
    //   423: iconst_1
    //   424: iadd
    //   425: istore 4
    //   427: goto -329 -> 98
    //   430: aload_2
    //   431: invokeinterface 222 1 0
    //   436: astore 11
    //   438: aload 11
    //   440: checkcast 224	java/util/Map$Entry
    //   443: astore 11
    //   445: aload 11
    //   447: invokeinterface 227 1 0
    //   452: astore 12
    //   454: aload 12
    //   456: checkcast 10	java/lang/String
    //   459: astore 12
    //   461: new 131	java/lang/StringBuilder
    //   464: dup
    //   465: aload 12
    //   467: invokestatic 135	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   470: invokespecial 136	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   473: ldc -53
    //   475: invokevirtual 142	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   478: astore 12
    //   480: aload 11
    //   482: invokeinterface 230 1 0
    //   487: astore 11
    //   489: aload 11
    //   491: checkcast 10	java/lang/String
    //   494: astore 11
    //   496: aload 12
    //   498: aload 11
    //   500: invokevirtual 142	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   503: invokevirtual 146	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   506: astore 11
    //   508: aload 9
    //   510: iload 4
    //   512: aload 11
    //   514: aastore
    //   515: iload 4
    //   517: iconst_1
    //   518: iadd
    //   519: istore 4
    //   521: goto -384 -> 137
    //   524: aconst_null
    //   525: astore_2
    //   526: goto -279 -> 247
    //   529: aload_1
    //   530: iload 4
    //   532: aaload
    //   533: astore 13
    //   535: ldc -24
    //   537: iconst_2
    //   538: anewarray 4	java/lang/Object
    //   541: dup
    //   542: iconst_0
    //   543: aload 10
    //   545: aastore
    //   546: dup
    //   547: iconst_1
    //   548: aload 13
    //   550: aastore
    //   551: invokestatic 59	java/lang/String:format	(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   554: invokestatic 62	com/CHEF-KOCH/a/Debug:logCommand	(Ljava/lang/String;)V
    //   557: aload 12
    //   559: new 131	java/lang/StringBuilder
    //   562: dup
    //   563: aload 13
    //   565: invokestatic 135	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   568: invokespecial 136	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   571: ldc -22
    //   573: invokevirtual 142	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   576: invokevirtual 146	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   579: ldc -89
    //   581: invokevirtual 171	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   584: invokevirtual 175	java/io/DataOutputStream:write	([B)V
    //   587: aload 12
    //   589: invokevirtual 178	java/io/DataOutputStream:flush	()V
    //   592: iload 4
    //   594: iconst_1
    //   595: iadd
    //   596: istore 4
    //   598: goto -322 -> 276
    //   601: astore_1
    //   602: aconst_null
    //   603: astore_1
    //   604: goto -256 -> 348
    //   607: astore_1
    //   608: aconst_null
    //   609: astore_1
    //   610: goto -262 -> 348
    //   613: astore_1
    //   614: goto -303 -> 311
    //   617: astore_1
    //   618: goto -318 -> 300
    //   621: aload 8
    //   623: astore_1
    //   624: goto -276 -> 348
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	627	0	paramString	String
    //   0	627	1	paramArrayOfString1	String[]
    //   0	627	2	paramArrayOfString2	String[]
    //   0	627	3	paramBoolean	boolean
    //   96	501	4	i	int
    //   93	188	5	j	int
    //   385	27	6	k	int
    //   143	3	7	bool	boolean
    //   63	559	8	localList	java.util.List
    //   66	443	9	localObject1	Object
    //   7	537	10	str1	String
    //   79	434	11	localObject2	Object
    //   173	415	12	localObject3	Object
    //   231	333	13	str2	String
    //   238	16	14	localInputStream	java.io.InputStream
    // Exception table:
    //   from	to	target	type
    //   72	91	601	java/io/IOException
    //   105	114	601	java/io/IOException
    //   121	134	601	java/io/IOException
    //   137	145	601	java/io/IOException
    //   150	161	601	java/io/IOException
    //   161	175	601	java/io/IOException
    //   175	211	601	java/io/IOException
    //   211	240	601	java/io/IOException
    //   247	269	601	java/io/IOException
    //   300	306	601	java/io/IOException
    //   311	330	601	java/io/IOException
    //   334	341	601	java/io/IOException
    //   378	387	601	java/io/IOException
    //   392	402	601	java/io/IOException
    //   402	421	601	java/io/IOException
    //   430	438	601	java/io/IOException
    //   445	454	601	java/io/IOException
    //   461	489	601	java/io/IOException
    //   496	508	601	java/io/IOException
    //   535	557	601	java/io/IOException
    //   557	592	601	java/io/IOException
    //   72	91	607	java/lang/InterruptedException
    //   105	114	607	java/lang/InterruptedException
    //   121	134	607	java/lang/InterruptedException
    //   137	145	607	java/lang/InterruptedException
    //   150	161	607	java/lang/InterruptedException
    //   161	175	607	java/lang/InterruptedException
    //   175	211	607	java/lang/InterruptedException
    //   211	240	607	java/lang/InterruptedException
    //   247	269	607	java/lang/InterruptedException
    //   283	300	607	java/lang/InterruptedException
    //   300	306	607	java/lang/InterruptedException
    //   306	311	607	java/lang/InterruptedException
    //   311	330	607	java/lang/InterruptedException
    //   334	341	607	java/lang/InterruptedException
    //   378	387	607	java/lang/InterruptedException
    //   392	402	607	java/lang/InterruptedException
    //   402	421	607	java/lang/InterruptedException
    //   430	438	607	java/lang/InterruptedException
    //   445	454	607	java/lang/InterruptedException
    //   461	489	607	java/lang/InterruptedException
    //   496	508	607	java/lang/InterruptedException
    //   535	557	607	java/lang/InterruptedException
    //   557	592	607	java/lang/InterruptedException
    //   306	311	613	java/io/IOException
    //   283	300	617	java/io/IOException
  }
}
