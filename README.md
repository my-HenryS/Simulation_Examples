# SimulationExample

本项目是实验室开发的Simulation平台的演示样例，主要依赖于
SocialForceSimulation.jar, DL4j深度学习框架


1. 项目用Maven管理Java依赖库，运行环境JDK1.8.0以上 （The project utilize Maven 
 to manage JAR dependencies and it requires JDK version >= 1.8.0）.
2. 请自行参考样例编写Application，并在ApplicationLoader中注册新的Application
   （Please write your own simulation org.example.application and register it in the loader）
3. 请补充完整仿真模型的影响力（Force），并尝试修改参数或公式以使得仿真接近真实情况。
   （Please design and programme your simulation model and forces and try to modify it 
   in the org.example.application）
4. 课程大作业Option 2需要利用DL4j框架学习仿真数据，相关示例在RobustNeuralNetwork类中
   （Option 2 of the final assignment requires course participants to build neural network 
    with DL4j. The demo is named org.example.application.RobustNeuralNetwork.）
