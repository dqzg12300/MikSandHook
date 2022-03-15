# MikSandHook
魔改sandhook特征，MikRom注入dex实现免root的xposed案例

### 使用说明
可以自行修改Sandhook的特征，编译生成后，解压出dex后，使用MikRom注入，不过由于libsandhook.so是提前内置的，所以如果你修改了so相关的特征。需要将生成的libsandhook.so替换MikRom的里面自行编译。

目前我简单替换的关键词如下

> MikXpHelpers		->		MikXpHelpers
>
> XC_MethodHook	 ->		MIK_MethodHk
>
> findHkMethod	->	findHkMethod

### 使用步骤

1、直接在此项目编辑xposed相关代码，入口在`com.mik.miksandhook.Inject`

2、编译后解压apk获得dex文件

3、将dex上传到手机对应目录中，例如`/sdcard/Android/data/<PackageName>/`，如目录不存在，则手动创建

4、MikManager选择目标应用。选择注入dex。填写启动类名，如这个案例是`com.mik.miksandhook.Inject`

5、保存配置后，直接打开目标应用，即可成功。

### 视频演示

todo，近期会补上。

### 

### 完结撒花

我只做了简单的替换，如果有大佬把基本特征全部去掉了。可以发给我来替换内置的libsandhook.so。

到这里MikRom的配套功能大致完成。完结撒花。



### 重要提示

请勿将此项目用于非法用途。
