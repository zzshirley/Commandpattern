# Commandpattern 命令模式
从本质上说，Command 就是一个函数对象:一个被封装成对象的方法。通过把方法封装到一个对象，你可以把它当作参数传给其它方法或者对象，让它们在实现你的某个请求(request)的时候完成一些特殊的操作。你可能会说Command 其实就是一个把数据成员换成行为的 messenger(因为它的目的和使用方法都很直接)。
## 实现
    模拟小米的米家app，简单实现离家模式和回家模式。
    设计类图如下：
    <img src="https://github.com/zzshirley/Commandpattern/blob/master/类图.png" width="150" height="150" alt="图片加载失败时，显示这段字"/>
    离家模式：关闭所有家电，开启安防和摄像头。
