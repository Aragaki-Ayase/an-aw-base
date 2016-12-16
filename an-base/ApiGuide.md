## Api Guide --aN���APIָ���ο� 

�� - ���� - ˵�� - ���� - ����ֵ 

### DUtilsBitmap ����ͼƬ��Ĺ��� ��ö�ٵ���ģʽ

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
|:---------|:---|:---|---:|

��ע��Bitmap largeIcon = ((BitmapDrawable) getResources().getDrawable(R.drawable.ic_launcher)).getBitmap();//��ʱ�Ľ��������
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
			
### DataService ���ݲ����๤�� ��ö�ٵ���ģʽ