# Api Guide --aN���APIָ���ο� 

aN���APIָ���ο�-Api Guide  ����޸����� 2017��4��20��09:45:51

##  aN��ܹ�����ο���

�� - ���� - ˵�� - ���� - ����ֵ 

### [!FastBlurUtils] StackBlurģ���㷨���ܵõ��ǳ����õ�ë����Ч����

|��������|����˵��|����|����|
|:---------|:---|:---|---:|
|doBlur|����StackBlurģ���㷨|Bitmap sentBitmap, int radius, boolean canReuseInBitmap|Bitmap|

ʹ�òο���

Bitmap bitmap = FastBlurUtil.doBlur(sBitmap, 2, false);

### [!FileUtils] �ļ�������

|��������|����˵��|����|����|
|:---------|:---|:---|---:|
|copyAssetsToSD|����assetsĿ¼�µ��ļ���sd��<br>�����ʵ�ֽӿ�FileOperateCallback�������Ƿ��Ƴɹ�|final String srcPath, final String sdPath|FileUtils|
|getTotalCacheSize|�õ��ܻ����С|Context context|String|
|clearAllCache|�õ��ܻ����С|Context context|String|
|getFolderSize|�õ��ļ�Ŀ¼�µĴ�С|File file|long|
|getFormatSize|��ʽ����λ|double size|String|
|cleanInternalCache|�����Ӧ���ڲ�����(/data/data/com.xxx.xxx/cache)|Context context|void|
|cleanDatabases|�����Ӧ���������ݿ�(/data/data/com.xxx.xxx/databases) |Context context|void|
|cleanSharedPreference|�����Ӧ��SharedPreference(/data/data/com.xxx.xxx/shared_prefs) |Context context|void|
|cleanDatabaseByName|�����������Ӧ�����ݿ� |Context context, String dbName|void|
|cleanFiles|���/data/data/com.xxx.xxx/files�µ����� |Context context|void|
|cleanExternalCache|����ⲿcache�µ�����(/mnt/sdcard/android/data/com.xxx.xxx/cache)|Context context|void|


����ʹ�òο���
```groovy
String size = FileUtils.getTotalCacheSize(mContext);
```

```groovy
FileUtils.copyAssetsToSD(filePath,sdPath);
����ʵ��FileOperateCallback�ӿڣ�������
void onSuccess();
void onFailed(String error);
```

### [!PermissionUtils] Ϊandroid6.0����ϵͳ�ṩ��Ȩ�޼�⹤���ࡣ

|��������|����˵��|����|����|
|:---------|:---|:---|---:|
|requestPermission|����Ȩ��|nt requestCode, PermissionGrant permissionGrant|void|
|requestMultiPermissions|һ��������Ȩ��|PermissionGrant grant|void|
|requestPermissionsResult|Need consistent with requestPermission|int requestCode, @NonNull String[] permissions,
                                         @NonNull int[] grantResults, PermissionGrant permissionGrant|void|
|getNoGrantedPermission|return no granted and shouldShowRequestPermissionRationale permissions|Activity activity, boolean isShouldRationale|ArrayList<String>|
|lacksPermissions|�ж�Ȩ�޼���|String... permissions|boolean|
|lacksPermission|�ж��Ƿ�ȱ��Ȩ��|String permission|boolean|
|requestPermissions|����Ȩ��|String[] PERMISSIONS, int requestCode, String permission|void|

ʹ�òο���

PermissionUtils.requestPermissions(PERMISSIONS, 2, permission);

### [!DUtilsBitmap](https://github.com/qydq/an-aw-base/blob/master/an-base/src/main/java/com/an/base/utils/DUtilsBitmap.java) ����ͼƬ��Ĺ��� ����ö�ٵ���ģʽ��

|��������|����˵��|����|����|
|:---------|:---|:---|---:|
|saveAvatarFile|�����ļ�|Context context, Bitmap bm, String dir, String fileName|��|
|saveBitmap|�����ļ�|Bitmap bm, String dir, String picName|��|
|getImage|ͨ��·����ȡͼƬ|String path|byte|
|readInputStream|�õ�������|InputStream inputStream|byte|
|ReadBitmapById|��ȡ������Դ��ͼƬ|Context context, int resId|Bitmap|
|ReadBitmapById|������Դ�ļ���ȡBitmap|Context context, int drawableId,int screenWidth, int screenHight|Bitmap|
|getBitmap|�ȱ���ѹ��ͼƬ|Bitmap bitmap, int screenWidth, int screenHight|Bitmap|
|drawableToBitmap|ת����bitmap����|Drawable drawable|Bitmap|
|bitmapToDrawable|ת����drawable����|Bitmap bitmape|Bitmap|
|createRoundedCornerBitmap|�õ�Բ��ͼƬbitmap����|Bitmap bitmap, float roundPx|Bitmap|
|createReflectionImageWithOrigin|��ô���Ӱ��ͼƬ����|Bitmap bitmap|Bitmap|
|createWatermarkBitmap|ͼƬˮӡ�����ɷ���|Bitmap src, Bitmap watermark|Bitmap|
|zoomBitmap|�Ŵ���СͼƬ|Bitmap bitmap, int w, int h|Bitmap|
|zoomBitmap|����������ͼƬ��scaleΪ��������<br>Ϊ��ֹԭʼͼƬ�������ڴ��������������Сԭͼ��ʾ��Ȼ���ͷ�ԭʼBitmapռ�õ��ڴ�<br>������С��1/2,��ͼƬ����ʱ��Ȼ����ּ��ز���,��ϵͳ��һ��BITMAP�������10M����,<br>���ǿ��Ը���BITMAP�Ĵ�С���ݵ�ǰ�ı�����С,�������ǰ��15M,���������С����6M,��ôSCALE= 15/6|Bitmap photo, int SCALE|Bitmap|
|decodeBitmapFromResource|Ϊ�˱���OOM�쳣������ڽ���ÿ��ͼƬ��ʱ���ȼ��һ��ͼƬ�Ĵ�С|Resources res, int resId,
                                           int reqWidth, int reqHeight|Bitmap|
|decodeBitmapFromPath|Ϊ�˱���OOM�쳣������ڽ���ÿ��ͼƬ��ʱ���ȼ��һ��ͼƬ�Ĵ�С,pathΪ����·��|String path,
                                       int reqWidth, int reqHeight|Bitmap|

��ע��Bitmap largeIcon = ((BitmapDrawable) getResources().getDrawable(R.drawable.ic_launcher)).getBitmap();

//��ʱ�Ľ��������
Drawable drawable = ContextCompat.getDrawable(getApplicationContext(), R.drawable.ic_launcher);

BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;

Bitmap largeIcon = bitmapDrawable.getBitmap();

		//����֪ͨ��Notification
		public Notification setNotification(String showTitle, String showInfo, Intent intent, boolean isCancel) {
			nm = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
			NotificationCompat.Builder builder = new NotificationCompat.Builder(getApplicationContext());//v7��ok
		//        builder = new Notification.Builder(getApplicationContext());//v4��ok
				int smallIconId = R.drawable.base_drawable_circle_click;
		//        Bitmap largeIcon = ((BitmapDrawable) getResources().getDrawable(R.drawable.ic_launcher)).getBitmap();//��ʱ�Ľ��������
				Drawable drawable = ContextCompat.getDrawable(getApplicationContext(), R.drawable.ic_launcher);
				BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
				Bitmap largeIcon = bitmapDrawable.getBitmap();
				builder.setLargeIcon(largeIcon)
						.setSmallIcon(smallIconId)
						.setContentTitle(showTitle)
						.setContentText(showInfo)
						.setTicker(showTitle)
						.setAutoCancel(isCancel)
						.setContentIntent(PendingIntent.getActivity(getApplicationContext(), 0, intent, 0));
				Notification n = builder.build();
				nm.notify(NOTIFICATION_START, n);
				return n;
			}
			
### [!DataService](https://github.com/qydq/an-aw-base/blob/master/an-base/src/main/java/com/an/base/utils/DataService.java) ���ݲ����๤�� ����ö�ٵ���ģʽ��

|��������|����˵��|����|����|
|:---------|:---|:---|---:|
|checkIp|md5��֤ip��ַ�Ƿ�Ϸ�|String ip|boolean|
|checkMobiles|��֤�Ƿ�Ϊ�绰����|String mobiles|boolean|
|md5|md5�����ַ���|String text|String|
|byteArrayToHex|Convert hex string to byte[]|String hexString|byte[]|
|byteArrayToHex|��������������ڽ��ֽ����黻�ɳ�16���Ƶ��ַ���|byte[] byteArray|String|
|getCurrentTimeByDate|�õ���ǰʱ��|��|String|
|getCurrentTimeByCalendar|��ȡ����ʱ��|��|Date|
|getShotDateTime|��ȡ��ʱ��|��|String|
|getLongDateTime|��ȡ��ʱ��|��|String|
|removeItemByName|ͨ���ֶ����Ƴ�ĳ��list�е�����|List<String> lists, String name|List<String>|
|removeItemByPosition|�Ƴ�ĳ��λ�ú��lists|List<String> lists, int position|List<String>|
|islegalInput|//����ַ����Ƿ�Ϸ����Ϸ�����true�����Ϸ�����false|String txt|boolean|

### [!NetBroadcastReceiverUtils](https://github.com/qydq/an-aw-base/blob/master/an-base/src/main/java/com/an/base/utils/NetBroadcastReceiverUtils.java) ���������

|��������|����˵��|����|����|
|:---------|:---|:---|---:|
|getNetworkState|�õ����������״̬��״̬�������״̬�롣ΪNetBroadcastReceiverUtils�ṩ����|Context context|int|
|isWifiConnected|����Ƿ���WIFI|Context context|boolean|
|isMobileConnected|����Ƿ����ƶ�����|Context context|boolean|
|isConnectedToInternet|����Ƿ�����������|Context context|boolean|

### [!DUtilsUi](https://github.com/qydq/an-aw-base/blob/master/an-base/src/main/java/com/an/base/utils/DUtilsUi.java) UI�����Ĺ�������ͨ����ģʽ

|��������|����˵��|����|����|
|:---------|:---|:---|---:|
|playHeartbeatAnimation|��ťģ����������|final View view|void|

### [!DUtilsStorage](https://github.com/qydq/an-aw-base/blob/master/an-base/src/main/java/com/an/base/utils/DUtilsStorage.java) ��������ࣨö�ٵ���ģʽ��

|��������|����˵��|����|����|
|:---------|:---|:---|---:|
|checkExistRom|�ж�����SDcard�Ƿ���� rom��������, �ɲ��жϣ���Ϊ���ö����С�|void|boolean|
|getRomPath|��ȡ����SDcard��·��|void|String|
|getSdcardPath|��ȡ����SDcard��·��|void|String|
|calculate|����SD��ʣ��������������|void|String ������andʣ������|

##  aN���Widget

WResizeRelativeLayout �����������Ƿ񵯳��رգ�Ȼ������ز�����
WResizeRelativeLayout���ṩ�Ľӿ�--
		public interface KeyBordStateListener {
			void onStateChange(int state);
		}

        
		@Override
			public void onStateChange(int state) {
				switch (state) {
					case ResizeRelativeLayout.HIDE:
		//                card.setVisibility(View.VISIBLE);
		//                cardSmall.setVisibility(View.INVISIBLE);
						break;
					case ResizeRelativeLayout.SHOW:
		//                card.setVisibility(View.GONE);
		//                cardSmall.setVisibility(View.VISIBLE);
						break;
			}
		}
		
�������ִ���ο���
		<?xml version="1.0" encoding="utf-8"?>
		<com.an.base.view.widget.WResizeRelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
		xmlns:app="http://schemas.android.com/apk/res-auto"
		android:id="@+id/login_root"
		android:layout_width="match_parent"
		android:layout_height="match_parent"
		android:background="@drawable/shape_login_bg_start">

		<android.support.v7.widget.CardView
        android:id="@+id/card_small"
        android:layout_width="40dp"
        android:layout_height="40dp"
        android:layout_alignParentRight="true"
        android:layout_alignParentTop="true"
        android:layout_margin="20dp"
        android:visibility="invisible"
        app:cardBackgroundColor="@color/transparent"
        app:cardCornerRadius="2dp"
        app:cardElevation="2dp">

        <com.an.base.view.widget.WRoundedImageView
            android:id="@+id/profile_small"
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:background="@drawable/login_btn_photo_l"
            android:scaleType="fitCenter"
            android:src="@drawable/photo_l"
            app:riv_corner_radius="2dp" />
		</android.support.v7.widget.CardView>

		<LinearLayout
        android:layout_width="315dp"
        android:layout_height="wrap_content"
        android:layout_centerInParent="true"
        android:layout_marginLeft="20dp"
        android:layout_marginRight="20dp"
        android:orientation="vertical">

        <android.support.v7.widget.CardView
            android:id="@+id/card"
            android:layout_width="98dp"
            android:layout_height="98dp"
            android:layout_gravity="center_horizontal"
            android:layout_marginBottom="@dimen/login_input_height"
            app:cardBackgroundColor="@color/transparent"
            app:cardCornerRadius="2dp"
            app:cardElevation="2dp">

            <com.makeramen.roundedimageview.RoundedImageView
                android:id="@+id/profile"
                android:layout_width="match_parent"
                android:layout_height="match_parent"
                android:background="@drawable/login_btn_photo_l"
                android:scaleType="fitCenter"
                android:src="@drawable/photo_l"
                app:riv_corner_radius="2dp" />
        </android.support.v7.widget.CardView>

        <EditText
            android:id="@+id/et_login_username"
            android:layout_width="match_parent"
            android:layout_height="@dimen/login_input_height"
            android:layout_marginLeft="@dimen/login_margin_left"
            android:background="@drawable/shape_solid_transparent"
            android:drawableLeft="@drawable/login_icon_company"
            android:drawablePadding="@dimen/login_padding"
            android:hint="@string/login_input_hint_username"
            android:inputType="textPersonName"
            android:singleLine="true"
            android:textColor="@color/ColorPrimary"
            android:textColorHint="@color/text_hint_color"
            android:textCursorDrawable="@drawable/common_input_cursor"
            android:textSize="@dimen/login_input_text_size" />

        <TextView
            android:id="@+id/line1"
            style="@style/common_login_horizontalLine_matchParent_normal" />

        <EditText
            android:id="@+id/et_login_employ_name"
            android:layout_width="match_parent"
            android:layout_height="@dimen/login_input_height"
            android:layout_marginLeft="@dimen/login_margin_left"
            android:background="@drawable/shape_solid_transparent"
            android:drawableLeft="@drawable/login_icon_man"
            android:drawablePadding="@dimen/login_padding"
            android:hint="@string/login_input_hint_employ"
            android:inputType="textPersonName"
            android:singleLine="true"
            android:textColor="@color/ColorPrimary"
            android:textColorHint="@color/text_hint_color"
            android:textCursorDrawable="@drawable/common_input_cursor"
            android:textSize="@dimen/login_input_text_size" />

        <TextView
            android:id="@+id/line2"
            style="@style/common_login_horizontalLine_matchParent_normal" />


        <EditText
            android:id="@+id/et_login_pwd"
            android:layout_width="match_parent"
            android:layout_height="@dimen/login_input_height"
            android:layout_marginLeft="@dimen/login_margin_left"
            android:background="@drawable/shape_solid_transparent"
            android:drawableLeft="@drawable/login_icon_lock"
            android:drawablePadding="@dimen/login_padding"
            android:hint="@string/login_input_hint_pwd"
            android:inputType="textPassword"
            android:singleLine="true"
            android:textColor="@color/ColorPrimary"
            android:textColorHint="@color/text_hint_color"
            android:textCursorDrawable="@drawable/common_input_cursor"
            android:textSize="@dimen/login_input_text_size" />

        <TextView
            android:id="@+id/line3"
            style="@style/common_login_horizontalLine_matchParent_normal" />

        <CheckBox
            android:id="@+id/remember_pwd"
            style="@style/RememberPasswordCheckBox"
            android:layout_marginLeft="@dimen/login_margin_left"
            android:text="@string/login_remember_pwd" />

        <Button
            android:id="@+id/btn_login"
            android:layout_width="match_parent"
            android:layout_height="46dp"
            android:layout_gravity="center_horizontal"
            android:layout_marginTop="32dp"
            android:background="@drawable/common_green_btn_selector"
            android:focusable="true"
            android:text="@string/login_button_text"
            android:textColor="@color/text_button_login"
            android:textSize="@dimen/login_btn_text_size" />
    </LinearLayout>

</com.qianmi.shine.widget.ResizeRelativeLayout>

WRoundImageView Բ��ImageView�����������������Ȳ�ͬ����ɫ��ͬ��Բ�α߿�


		WRoundImageView.setImageBitmap(bitmap);
		WRoundImageView.setImageResource(R.drawable.default_avatar);
		
	/**
     * ��ȡ�ü����Բ��ͼƬ
     * @param radius
     * �뾶
     */
    public Bitmap getCroppedRoundBitmap(Bitmap bmp, int radius) {
	
WIoScrollView ���Է�IOS���F�������ԁѾֵ�Ч����
ʹ�ý��䅢����

[sst_coordinatorlayout_wtiocrollview.xml](https://github.com/qydq/an-aw-base/tree/master/app/src/main/res/layout/sst_coordinatorlayout_wtiocrollview.xml) 

WSlidingDeleteListView ����ɾ����ListView
ʹ�òο���
https://zhuanlan.zhihu.com/p/24408002

WToggleButton aN�ṩ�Ĺ������زο���
https://zhuanlan.zhihu.com/p/24275861?refer=sunst

### [!CaptureHelper](https://github.com/qydq/an-aw-base/blob/master/an-base/src/main/java/com/an/base/utils/CaptureHelper.java) ���ո�����

ʹ�÷��� CaptureHelper helper = new CaptureHelper(skRoot,mcontext);

|��������|����˵��|����|����|
|:---------|:---|:---|---:|
|capture|���գ���ʱ�����������Ե���getPhoto�õ�ʱ��������file��Ƭ|��|mActivity.startActivityForResult(captureIntent, RESULT_CAPTURE_CODE);|
|capture|���գ���ʱ�����������Ե���getPhoto�õ�ʱ��������file��Ƭ|String saveName, boolean isNoFaceDetection|mActivity.startActivityForResult(captureIntent, RESULT_CAPTURE_CODE);|
|photo|����ϵͳ��ᣬ������RESULT_PHOTO_CODE|��|��|
|startPhotoZoom|ԭʼuri��һ��δdata.getData()  �ü�ͼƬ����ʵ��,ϵͳ���Զ�����android�汾���ú��ʵķ�����|Uri uri, int cropWidthSize, int cropHeightSize|mActivity.startActivityForResult(intent, RESULT_PHOTO_CROP_CODE);|
|startPhotoZoom|ԭʼuri��һ��δdata.getData()  ,�ü���������ΪcropName��jpg��Ƭ,�ü�ͼƬ����ʵ��,ϵͳ���Զ�����android�汾���ú��ʵķ�����|Uri uri, String cropName,int cropWidthSize, int cropHeightSize|mActivity.startActivityForResult(intent, RESULT_PHOTO_CROP_CODE);|
|startCaptureZoom|����ϵͳ�������Ե��ø÷���Ϊ��Ƭ�ü�|String originName, String cropName|void|
|saveBitmap|�÷�������ʹ�ã�������ΪsaveName����Ƭ���ڴ濨,ʹ�÷�������|Bitmap mBitmap, String saveName|String|
|getPath|�����ǹؼ���ԭ��uri���ص���file:///...���ŵģ�android4.4���ص���content:///..|final Context context, final Uri uri|String|

ʹ�òο�

		//ѡȡ��Ƭ�ü��󷵻ء���������������ͼƬ��ʾ���ؼ��С�
                case RESULT_PHOTO_CROP_CODE:
                    if (data != null) {
                        Bundle extras = data.getExtras();
                        if (extras != null) {
                            Bitmap bitmap = extras.getParcelable("data");
                            Bitmap roundBitmap = DUtilsBitmap.INSTANCE.createReflectionImageWithOrigin(bitmap);
                            iv.setImageBitmap(roundBitmap);
                            //����
                            captureHelper.saveBitmap(bitmap, IMAGE_FILE_NAME);
                        }
                    }
                    break;