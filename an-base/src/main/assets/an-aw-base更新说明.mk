an-aw-base version 0.3 ����˵������˳�Σ�qydq������ ��ݪ�ܻ� ��qyddai��2017��4��7�� 17:57:43��

��0.3��ǰҲһ����һ����˵�������������������samples����Ҳο���

��ΰ汾0.3����Ҫ������Ϊ��an-aw-base�ܹ���Ӧandroid6.0���ϵ�ϵͳ��Ȩ�����⣬���ӹ淶������

1.widget˵����

(���ͼƬ�鿴��ֱ��)(ʹ��˵���ο�����ĵ���an���ʹ��˵�������ӣ�)

luueϵ�к�yϵ�У����������Ԣ�����luyue��ƴ����¶�¡�������an-aw-base��ж���Դ������������Ҳ�����������ĳ�����������Ȼ������
�������ڸĿ��Ҳ��Ҫ�ö�ö�ʱ��ģ�������Щ����������Ҫ��У����Ի���ѡ��ά������ܹ��ɣ������޸��κ��˶�����⣩��
����㣨huaqiangu)������Ҫ��ʦ����������ʶ������֪�������ʦ��������˵��һ������Ҫ���ˣ��ܶ�ʱ����ϲ��ֱ�ӣ���һ���˾��¸ң���Ȼû�н̵���ʲô��������Զ�����ҵ�С�ǡ�

��֪���㲻�ῴ����


��1��(luueϵ������ؼ���)

LuueCircleImageView--����Ϊ--LuueCircleIv

LuueDragImageView--����Ϊ--LuueDragIv

WRectangleView--����Ϊ--LuueRectangleIv

WRoundImageView--����Ϊ--LuueRoundIv

LuueScaleImageView--����Ϊ--LuueScaleIv

LuueSmoothImageView--����Ϊ--LuueSmoothIv

WToggleButton--����Ϊ--LuueToggleBb

����--LuueTouchIb

LuueVerticalViewPager--����Ϊ--LuueVerticalVp

LuueViewPager--����Ϊ--LuueVp

WZoomImageView--����Ϊ--LuueZoomIv


PowerImageView��view/ytips���ƶ���view/widget������Ϊ--LuuePowerIv

��2��(yϵ�����Ⲽ����)

WResizeRelativeLayout--����Ϊ--YresizeRelativeLayout

����--YshrinkFrameLayout

WShrinkScrollView--����Ϊ--YshrinkScrollView

WSlidingDeleteListView--����Ϊ--YslidingDeleteListView

WSlidingLayout--����Ϊ--YslidingLayout

WSwipeCloseFrameLayout--����Ϊ--YswipeCloseFrameLayout

WSwipeFinishFrameLayout--����Ϊ--YswipeFinishFrameLayout


2.������˵����

��1���޸�CaptureHelper ���հ�����

����android4.4��android7.0Ȩ�ޡ�

��2��utils/ytips������PermissionUtils�����ࣨ���Ǳ��θ��µ��ص㣩

��3��utils/ytips����FastBlurUtil ���õ���StackBlurģ���㷨 ë����Ч����

��4��utils/ytips����FileUtils����sd��Ȩ�ޣ��Ƿ����android60+�����ԡ�

��5��SizeUtil ���Ӹ��෽�� ����dip/dp ��getStatusBarHeight����ο����ࡣ

��6��Ϊ������Ȩ�޵����⣬��res/��������an-aw-base �ļ��ṩ��Դbase_fileprovider_tackphoto������Ϊname="an_ytips"
provider�ο���ʹ�õ�ʱ��������com.an.base.fileprovider.tackphoto��������
<provider
            android:name="android.support.v4.content.FileProvider"
            android:authorities="com.an.base.fileprovider.tackphoto"
            android:exported="false"
            android:grantUriPermissions="true">


3.����˵���������ݡ�

��1�����������model/utils�� --��Ϊ��model/ytips��

