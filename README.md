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
	
1.ǰ�ԣ���������Ŀ��Ҫʹ�÷��������ܵļ򵥸���;��������,��ѡ����

2.ʵ��Ч�������û�п���ʡ�ԣ������������

3.˼·��ʹ�ã����룩��

+ *ʵ��˼·*

+ *ʹ�÷���*

4.��Ҫ֪ʶ�㣨�ܽᣬ˼������

5.���ݲο�������ԭ������

6.��ϵ���ߡ�


# [![](https://jitpack.io/v/qydq/an-maven-base.svg)](https://jitpack.io/#qydq/an-maven-base)   ![](https://github.com/qydq/an-aw-base/blob/master/an-base/src/main/res/drawable/base_drawable_art_click.png)

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

 >*i.   HTTPʵ��������XHttps�ṩ��post,get,upLoadFile,downLoadFile...*

 >*ii.  �������������ʹ��ע�⹦�ܣ����Բο�xUtils3��Դ��Ŀ��*

 >*iii. �ṩ���XCallBack ,XParseResponse ,XProgressCallBack������*

+ an��ܰ��������ʵ�õĹ����࣬��MD5���ܣ�����У�飬ҹ��ģʽ�л��ȡ�

+ an��ܼ���Toastʹ�ã�ֱ��showToast��

+ an��ܼ���������ҹ��ģʽ�Ĺ��ܡ�

+ an����ṩ�˿��ټ�������仯�ķ�����

+ an��ܺ��ڹ������������С�

---------

# 2. ʵ��Ч��

+ **an����ṩ��WToggleButton �л��ؼ�**

 ![](https://github.com/qydq/an-aw-base/blob/master/screen/base_wtogglebutton.gif)

+ **an����ṩͨ�õı�����ͷ���ɣ�ʵ��ʹ��ʱ������ɫCommMainBg������ͼ**

��1����ͨ״̬���ο�<br>

 ![](https://github.com/qydq/an-aw-base/blob/master/screen/base_headview_standard.png)

��2������״̬���ο�<br>

 ![](https://github.com/qydq/an-aw-base/blob/master/screen/base_headview_standard_complex.png)


---------

# 3. ˼·��ʹ�ã����룩
		
### ʵ��˼·

+ **An��������淶**

�����淶��һ����Ŀ�зǳ���Ҫ�Ĳ��֣��κ����鲻�淶�������˿������㣬�Լ������˽��Լ���<br>
[An��������淶�ο�](https://zhuanlan.zhihu.com/p/24155927)

��1��layout����ο�

	base_standard_dialog.xml
	base_standard_dialog_progress.xml
	sst_activity_drawerarrow
	sst_fragment_drawerarrow
	sst_fragment_index2

��2��drawable����ο�

	base_drawable_loading.png
	yy_drawable_bgday_shape.xml
	yy_drawable_bgnigt_shape.xml
	yy_drawable_selector_md.xml
	yy_drawable_selector_md_shape.xml
	
+ **An���״̬��**

<font color=#0099ff size=12 face="����">��ע��aN����ṩͨ��״̬�����޸ĸ�base_drawable_backarrow��base_drawable_backarrow_clickͼƬ�����ֿ��޸�CommColorGray��CommColorWhite��������ɫCommTxtMainColor���޸ģ������һ�����СCommDimenBarTitleMax��*�޸ĵ�ʱ��ֱ���滻����*��</font>

��1����ͨ״̬���ο�<br>

<font>Tips: �����ı���СCommDimenBarTitleSmall���޸�;</font>

		<include
        android:id="@+id/includeHead"
        layout="@layout/base_headview_standard"
        android:layout_width="match_parent"
        android:layout_height="wrap_content" />
		
��2������״̬���ο�<br>

<font color=#0099ff size=12 face="����">Tips��aN����ṩ����״̬�����޸Ĵ�����ͼƬbase_drawable_art��base_drawable_art_click��base_drawable_share��base_drawable_share_click���ı���С��CommDimenTxtSSmall�����޸ġ�;</font>

		<include
        android:id="@+id/includeHead"
        layout="@layout/base_headview_standard_complex"
        android:layout_width="match_parent"
        android:layout_height="wrap_content" />
		
+ **Anͨ��**

###### Style

AnTvContentStyle �ṩ���ı��������⡣

AnTvTitleStyle �ṩ���ı��������⡣



### ʹ�÷���

+ **An���ҹ��ģʽ**

��1����ҹ��ģʽʹ��<br>

<font color=#0099ff size=12 face="����">��ע��aN����ṩ�����ݱ���Sp��ֱ��sp.edit���ɵõ�Editor������editor = sp.edit();</font>

	//��������Ƥ���л�ģʽ��sp
	if (sp.getBoolean("isNight", false)) {
        getWindow().getDecorView().setBackground(ContextCompat.getDrawable(mContext,R.drawable.yy_drawable_bgday_shape));
        tvChangModel.setText("�����ǰ��죬����л�����");
        editor.putBoolean("isNight", false);
        } else {
        getWindow().getDecorView().setBackground(ContextCompat.getDrawable(mContext,R.drawable.yy_drawable_bgnigt_shape));
        tvChangModel.setText("���������ϣ�����л�����");
        editor.putBoolean("isNight", true);
        }
��2����֪������ҹ��ģʽ�л�ʵ����·<br>

[Android ����an��ܿ���ʵ��ҹ��ģʽ��������·](https://zhuanlan.zhihu.com/p/22520818?refer=qyddai)

[Android ����an��ܿ���ʵ��ҹ��ģʽ��������·-��ǿ��](https://zhuanlan.zhihu.com/p/22520818?refer=qyddai)

+ **An����ṩ��WToggleButton��ʹ�òο�** *��Դ�������ҹ��ģʽʹ�ã�*

<font color=#0099ff size=12 face="����">��ע��Default Size:width=50dp,height=30dp.����editor = sp.edit();</font>

		xmlns:toggle="http://schemas.android.com/apk/res-auto"

		<com.an.base.view.widget.WToggleButton
            android:layout_width="60dp"
            android:layout_height="30dp"
            android:layout_marginTop="@dimen/CommDimenMargin"
            toggle:tbBorderWidth="2dp"
            toggle:tbOffBorderColor="#000"
            toggle:tbOffColor="#ddd"
            toggle:tbOnColor="#f00"
            toggle:tbSpotColor="#00f" />
			
		private WToggleButton toggleBtn;
		
		    //�л�����
		toggleBtn.toggle();
		//�л��޶���
		toggleBtn.toggle(false);
		//�����л��¼�
		toggleBtn.setOnToggleChanged(new OnToggleChanged(){
        @Override
        public void onToggle(boolean on) {
        }
		});

		toggleBtn.setToggleOn();
		toggleBtn.setToggleOff();
		//�޶����л�
		toggleBtn.setToggleOn(false);
		toggleBtn.setToggleOff(false);

		//���ö���
		toggleBtn.setAnimate(false);
			

+ **����״̬����**

[����״̬����-MainActivity.java-onNetChange](https://raw.githubusercontent.com/qydq/an-aw-base/master/app/src/main/java/com/qyddai/an_aw_base/MainActivity.java)

+ **DUtilsDialogʹ��**

[Android ����an��ܿ��ټ���Dialog�Ի���ʾ������](https://zhuanlan.zhihu.com/p/24146818)

//android:background="@color/CommColorDialog"<br>
[An���ʾ��-MainActivity.java��Ӧ��ͨdialog](https://raw.githubusercontent.com/qydq/an-aw-base/master/app/src/main/java/com/qyddai/an_aw_base/MainActivity.java)

//android:background="@drawable/yy_shape_dialog_progress"<br>
[An���ʾ��-TestActivity.java��ӦProgressDialog](https://github.com/qydq/an-aw-base/blob/master/app/src/main/java/com/qyddai/an_aw_base/TestActivity.java)

+ **XHttps��������ʹ�÷���**

[Android����aN��ܿ���ʵ����������(���ϴ������ļ����߼�-��ǿ��](https://zhuanlan.zhihu.com/p/24132012)

[aN���ʾ��-XHttpsActivity.java����ע�⣬ContentVIew����](https://raw.githubusercontent.com/qydq/an-aw-base/master/app/src/main/java/com/qyddai/an_aw_base/XHttpsActivity.java)

+ **ѡ����**
	
|ѡ��������|����˵��|�߿�|Բ��|
|:---------|:-------|:---|---:|
|drawable_selector_md|CommColorTransparent<br>CommColorTransparentClicked<br>CommColorDayBackground|��|��|
|drawable_selector_md_shape|CommColorTransparent<br>CommColorTransparentClicked<br>CommColorDayBackground|CommColorBorder<br>CommColorBorderClicked|2dp|
|drawable_selector_txt|CommColorGray<br>CommColorWhite|��|��|
|drawable_selector_ll_shape|CommEndColor<br>CommStartColor<br>CommMainBgClicked<br>CommMainBg|CommColorLineClicked<br>CommColorLine|2dp|

---------

# 4. ��Ҫ֪ʶ�㡣

+ **���ʹ��MVP�ܹ��AndroidӦ�ó���-(demo+����)-�����**

+ **Android MVP�ܹ�ʾ����Ŀ����-��ǿ��**
		
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
		//����jitpack
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
		compile 'com.android.support:design:24.2.0'<!--android md�����Ե�����-->
	
## an-aw-base > project /build.gradle

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

