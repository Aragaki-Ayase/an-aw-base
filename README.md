# an-aw-base

* ��Ŀ����Ҫ��������Ϊan��ܵĻ��ࣨ������an-base���Ĳֿ⣻����Խ���github��jitpack ��bintrary���ټ��ɡ�

* �����Դ�ڱ���an-maven-base��ܣ�an-aw-base���ȥ����an-maven-base��ܲ����õĹ��ܣ����������������ܡ�

*����Ŀ��ַ��https://github.com/qydq/an-aw-base*

**ʹ�ý��ܣ����¼���֪������������ײ��͡�**

>����֪����ҳ��https://www.zhihu.com/people/qydq

>���˲�����ҳ��https://bgwan.blog.163.com


**����ʹ�������뷢�͵����ʼ���**

>�ʼ���ַ�� staryumou@163.com  /  qyddai@gmail.com


**�ر�˵��**

	
>����ʱ�� <------2016��09��17��------->
	
>2016��09��17��;����޸�ʱ�䣺2016��09��19�ա�

########
	
**Ŀ¼**
	
1. ǰ�ԣ���������Ŀ��Ҫʵ�ֵĹ��ܵļ��˵�����������ã���ѡ����

2. ʵ��Ч�������û�п���ʡ�ԣ������������

3. ˼·��ʹ�ã����룩��

+ *ʵ��˼·*

+ *ʹ�÷���*

* 4.��Ҫ֪ʶ�㣨�ܽᣬ˼������

* 5.���ݲο�������ԭ������

* 6.��ϵ���ߡ�


# [![](https://jitpack.io/v/qydq/an-maven-base.svg)](https://jitpack.io/#qydq/an-maven-base)

#######

# 1. ǰ��

**ʹ��Gradle����ʱ���������������** *��ע��Ҳ����ʹ��֮ǰ�ĵ��ȶ��汾��*

`compile 'com.github.qydq:an-maven-base:0.1.3'`

���߼��룺

`compile 'cn.android.sunst:an-base:0.0.2'`

��Ҫʹ������an����������һ��������������ο�url = https://github.com/qydq/an

`compile 'com.github.qydq:an:0.0.1'`

���߼��룺

`compile 'cn.android.sunst:an:0.0.1'`

**ʹ�ý���**

>ʹ�ý���̳�SuperActivity��SuperFragment��BasePresenter��BaseView��

>ʹ�ý�����AndroidManifest.xml�м���android:theme="@style/Theme.AppCompat.Light.NoActionBar"`��

>ʹ�ý����ڱ����build��ʱ��ע��an-aw-base��Ҫ��API=19�����ϰ汾���롣

**Tips**
---

+ an����ṩ��SuperActivity,SuperFragment,BasePresenter,BaseView�Ȼ������Google material design��

+ an����ṩ�������������xutilsģ��ķ�װ��httpʵ��XHttps��

*i.   HTTPʵ��������XHttps�ṩ��post,get,upLoadFile,downLoadFile...*

*ii.  �������������ʹ��ע�⹦�ܣ����Բο�xUtils3��Դ��Ŀ��*

*iii. �ṩ���XCallBack ,XParseResponse ,XProgressCallBack������*

+ an��ܰ��������ʵ�õĹ����࣬��MD5���ܣ�����У�飬ҹ��ģʽ�л��ȡ�

+ an��ܼ���Toastʹ�ã�ֱ��showToast��

+ an��ܼ���������ҹ��ģʽ�Ĺ��ܡ�

+ an����ṩ�˿��ټ�������仯�ķ�����

+ an��ܺ��ڹ������������С�

---------

# 2. ʵ��Ч��

an��ܣ�0.1.0�汾����ͨ�õı�����Ŀ�����Ժ�ļ��ɣ�ʵ��ʹ�õ�ʱ���ޱ�����ɫ������ͼ

| ![](https://github.com/qydq/an-maven-base/blob/master/screenpic/base_headview_standard_complex.png)| 


---------

# 3. ˼·��ʹ�ã����룩
		
### ʵ��˼·

### ʹ�÷���

+ **ѡ����**
	
|ѡ��������|����˵��|�߿�|Բ��|
|:---------|:-------|:---|---:|
|drawable_selector_md|CommColorTransparent<br>CommColorTransparentClicked<br>CommColorDayBackground|��|��|
|drawable_selector_md_shape|CommColorTransparent<br>CommColorTransparentClicked<br>CommColorDayBackground|CommColorBorder<br>CommColorBorderClicked|2dp|

---------

# 4. ��Ҫ֪ʶ�㡣
		
---------

# 5. ���ݲο�������ԭ������

����ԭ��

---------

# 6. ��ϵ���ߡ�

Athor IP��sunshuntao��qydq����ݪ�ܻ�����

Email��qyddai@gmail.com��

��ӭ���ʹ��aN���ٿ�����ܡ�
If it doesn't work, please send me a email, qyddai@gmail.com
An��ܿ��ܴ���һЩȱ�ݣ������⻶ӭ��ҷ������յ��ʼ��һ��һ��ʱ��ظ�����

Or

Import the library, then add it to your /settings.gradle and /app/build.gradle, if you don't know how to do it, you can read my blog for help.
http://drakeet.me/android-studio


#### ��ǣ�


## an-base > module /build.gradle

		apply plugin: 'com.android.library'
		////����jitpack
		apply plugin: 'com.github.dcendents.android-maven'
		group = 'com.github.qydq'
		dependencies {
		compile fileTree(dir: 'libs', include: ['*.jar'])
		androidTestCompile('com.android.support.test.espresso:espresso-core:2.2.2', {
        exclude group: 'com.android.support', module: 'support-annotations'
		})
		compile 'com.android.support:appcompat-v7:24.2.0'
		testCompile 'junit:junit:4.12'
		compile 'org.xutils:xutils:3.3.36'
		compile 'com.google.code.gson:gson:2.7'
		compile 'com.android.support:design:24.2.0'������
	
## an-maven-base > project /build.gradle

		buildscript {
		repositories {
			jcenter()
		}
		dependencies {
			classpath 'com.android.tools.build:gradle:2.2.0-rc2'
			// jitpack����github
			classpath 'com.github.dcendents:android-maven-gradle-plugin:1.5'
			// NOTE: Do not place your application dependencies here; they belong
			// in the individual module build.gradle files
		}
		}��
		
## Ȩ����ء�an-mave-base /AndroidManifest.xml	

		<!-- �������Ȩ�� -->
		<uses-permission android:name="android.permission.ACCESS_NETWORK_STATE" />
		<uses-permission android:name="android.permission.INTERNET" />
		<!-- ��SDCardд������Ȩ�� -->
		<uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE" />
		<!-- WIFI״̬�������Ȩ��-->
		<uses-permission android:name="android.permission.CHANGE_WIFI_STATE" />
		<uses-permission android:name="android.permission.ACCESS_WIFI_STATE" />
		<!-- ��SDCard �Ĺ���Ȩ�� -->
		<uses-permission android:name="android.permission.MOUNT_UNMOUNT_FILESYSTEMS" />
		
		
## ���뼰���SDK���á�

		android {
			compileSdkVersion 24
			buildToolsVersion "24.0.2"

			defaultConfig {
			minSdkVersion 19
			targetSdkVersion 24
			versionCode 1
			versionName "1.0"

			testInstrumentationRunner "android.support.test.runner.AndroidJUnitRunner"

		}
		
		˵�������棺�ڵ��õ�ActivityʱӦ��super.onCreate(savedInstanceState);������setBackUp�����ԣ����鲻Ҫ�ڵͰ汾�ø߰汾�����ݡ�
		
		
## ���幦�ܵ�ʹ�ÿ��Բο�release����־�ļ����������Ժ���ڸ���֪����һЩ���⡣

