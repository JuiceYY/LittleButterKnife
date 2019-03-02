# LittleButterKnife
现在可以注入的内容
1. Activity的布局注入, 不需在onCreate()方法中调用setContentView(), 在Activity上添加@ContentView()注解即可
2. 控件的注入, 不需要调用Activity的findViewById()方法, 在字段上添加@BindView()注解即可
3. View的点击事件和长按事件的注入, 定义好点击/长按需要执行的方法, 在方法上添加@OnClick()注解即可, 注解内参数为要监听的控件的id值.
