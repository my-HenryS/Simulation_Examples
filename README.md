# SimulationExample

本项目是实验室开发的Simulation平台的演示样例，主要依赖于
SocialForceSimulation.jar, DL4j深度学习框架


1. 项目用Maven管理Java依赖库，运行环境JDK1.8.0以上 （The project utilize Maven 
 to manage JAR dependencies and it requires JDK version >= 1.8.0）.
2. 请自行参考样例编写Application，并在ApplicationLoader中注册新的Application中
   （Please write your own simulation org.example.application and register it in the loader）
3. 请参考样例编写仿真模型（Model）,并在Application中相关位置调用
   （Please design and programme your simulation model and use it 
   in the org.example.application）
4. 课程大作业需要利用DL4j框架学习仿真数据，相关示例在RobustNeuralNetwork类中
   （Final assignment requires course participants build neural network 
    with DL4j. The demo is named org.example.application.RobustNeuralNetwork.）
