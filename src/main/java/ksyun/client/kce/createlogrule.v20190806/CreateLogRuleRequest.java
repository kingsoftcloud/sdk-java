package ksyun.client.kce.createlogrule.v20190806;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateLogRuleRequest
* @Description 请求参数
*/
@Data
public class CreateLogRuleRequest{
    /**集群Id*/
    @KsYunField(name="ClusterId")
    private String ClusterId;

    /**日志规则名称
- 不超过40个字符，只能包含小写字母、数字及分隔符("-"、"_"、".")，且必须以小写字母、数字开头和结尾*/
    @KsYunField(name="RuleName")
    private String RuleName;

    /**日志源*/
    @KsYunField(name="InputConfig")
    private InputConfigDto1 InputConfig;

    @Data
    @ToString
    public static class InputConfigDto1 {
        /**日志类型
- 1：容器标准输出
- 2：容器文件路径
- 3：主机文件路径*/
        @KsYunField(name="InputType")
        private Integer InputType;

        /**如果InputType=1，则该项必填*/
        @KsYunField(name="ContainerStandout")
        private ContainerStandoutDto2 ContainerStandout;

        @Data
        @ToString
        public static class ContainerStandoutDto2 {
            /**日志源
- 是否采集所有容器*/
            @KsYunField(name="AllContainer")
            private Boolean AllContainer;

            /**指定负载采集
- 如果 AllContainer 为false，SpecifiedWorkload 或 SpecifiedPodLabel 必须指定一项*/
            @KsYunField(name="SpecifiedWorkload")
            private SpecifiedWorkloadDto3 SpecifiedWorkload;

            @Data
            @ToString
            public static class SpecifiedWorkloadDto3 {
                /***/
                @KsYunField(name="NamespaceList",type=2)
                private List<NamespaceListDto4> NamespaceListList;

                @Data
                @ToString
                public static class NamespaceListDto4 {
                    /**命名空间名称*/
                    @KsYunField(name="NamespaceName")
                    private String NamespaceName;

                    /**是否采集所有负载*/
                    @KsYunField(name="AllContainer")
                    private Boolean AllContainer;

                    /**采集负载集合
- 如果 AllContainer=false，则此项为必填*/
                    @KsYunField(name="Workload",type=2)
                    private List<WorkloadDto5> WorkloadList;

                    @Data
                    @ToString
                    public static class WorkloadDto5 {
                        /**负载类型
- Deployment
- DaemonSet
- StatefulSet
- Job*/
                        @KsYunField(name="WorkloadType")
                        private String WorkloadType;

                        /**负载名称*/
                        @KsYunField(name="WorkloadName")
                        private String WorkloadName;

                    }

                }

            }

            /**指定PodLable采集
- 如果 AllContainer 为false，SpecifiedWorkload 或 SpecifiedPodLabel 必须指定一项*/
            @KsYunField(name="SpecifiedPodLabel")
            private SpecifiedPodLabelDto6 SpecifiedPodLabel;

            @Data
            @ToString
            public static class SpecifiedPodLabelDto6 {
                /**选择命名空间方式，有效值：1、2
- 1：指定命名空间
- 2：排除命名空间*/
                @KsYunField(name="NamespaceOperator")
                private Integer NamespaceOperator;

                /**命名空间集合，如果NamespaceOperator=2，该项为必填*/
                @KsYunField(name="Namespace",type=2)
                private List<String> NamespaceList;

                /**容器名称操作类型，如果ContainerName不为空，则该值为必填项。有效值：1、2
- 1：包含
- 2：不包含*/
                @KsYunField(name="ContainerNameOperator")
                private Integer ContainerNameOperator;

                /**容器名称*/
                @KsYunField(name="ContainerName")
                private String ContainerName;

                /***/
                @KsYunField(name="ContainerLabel",type=2)
                private List<ContainerLabelDto7> ContainerLabelList;

                @Data
                @ToString
                public static class ContainerLabelDto7 {
                    /**标签键，如果ContainerLabel不为空，则该值必填

*/
                    @KsYunField(name="Key")
                    private String Key;

                    /**标签值，如果ContainerLabel不为空，则该值必填

*/
                    @KsYunField(name="Value")
                    private String Value;

                    /**标签操作类型，有效值 1、2
- 1：key 等于 value
- 2：key 不等于 value*/
                    @KsYunField(name="Operator")
                    private Integer Operator;

                }

            }

        }

        /**容器文件路径，如果 InputType=2，则该项必填*/
        @KsYunField(name="ContainerFile")
        private ContainerFileDto8 ContainerFile;

        @Data
        @ToString
        public static class ContainerFileDto8 {
            /**指定容器*/
            @KsYunField(name="SpecifiedContainer")
            private SpecifiedContainerDto9 SpecifiedContainer;

            @Data
            @ToString
            public static class SpecifiedContainerDto9 {
                /**所属命名空间，如果 SpecifiedPodLabel 不为空，则该项必填*/
                @KsYunField(name="Namespace")
                private String Namespace;

                /**负载类型
- Deployment
- DaemonSet
- StatefulSet
- Job*/
                @KsYunField(name="WorkloadType")
                private String WorkloadType;

                /**负载名称*/
                @KsYunField(name="WorkloadName")
                private String WorkloadName;

                /**容器名称*/
                @KsYunField(name="ContainerName")
                private String ContainerName;

                /**设置要采集的日志文件的绝对路径，不支持通配符“*”
*/
                @KsYunField(name="ContainerPath")
                private String ContainerPath;

            }

            /**指定 PodLabel*/
            @KsYunField(name="SpecifiedPodLabel")
            private SpecifiedPodLabelDto10 SpecifiedPodLabel;

            @Data
            @ToString
            public static class SpecifiedPodLabelDto10 {
                /**选择命名空间方式，有效值：1、2
- 1：指定命名空间
- 2：排除命名空间*/
                @KsYunField(name="NamespaceOperator")
                private Integer NamespaceOperator;

                /**命名空间集合*/
                @KsYunField(name="Namespace",type=2)
                private List<String> NamespaceList;

                /**容器名称操作类型，有效值：1、2
- 1：包含
- 2：不包含*/
                @KsYunField(name="ContainerNameOperator")
                private Integer ContainerNameOperator;

                /**容器名称*/
                @KsYunField(name="ContainerName")
                private String ContainerName;

                /**设置要采集的日志文件的绝对路径，不支持通配符“*”

*/
                @KsYunField(name="ContainerPath",type=2)
                private List<String> ContainerPathList;

                /***/
                @KsYunField(name="ContainerLabel",type=2)
                private List<ContainerLabelDto11> ContainerLabelList;

                @Data
                @ToString
                public static class ContainerLabelDto11 {
                    /**标签键*/
                    @KsYunField(name="Key")
                    private String Key;

                    /**标签值*/
                    @KsYunField(name="Value")
                    private String Value;

                    /**标签操作类型，有效值 1、2
- 1：key 等于 value
- 2：key 不等于 value*/
                    @KsYunField(name="Operator")
                    private Integer Operator;

                }

            }

        }

        /**主机文件路径，如果 InputType=3，则该项必填*/
        @KsYunField(name="HostFile")
        private HostFileDto12 HostFile;

        @Data
        @ToString
        public static class HostFileDto12 {
            /**设置要采集的日志文件的绝对路径，不支持通配符“*”
*/
            @KsYunField(name="Path")
            private String Path;

            /***/
            @KsYunField(name="Label",type=2)
            private List<LabelDto13> LabelList;

            @Data
            @ToString
            public static class LabelDto13 {
                /**标签值*/
                @KsYunField(name="Value")
                private String Value;

                /**标签键*/
                @KsYunField(name="Key")
                private String Key;

            }

        }

    }

    /**消费端*/
    @KsYunField(name="OutputConfig")
    private OutputConfigDto14 OutputConfig;

    @Data
    @ToString
    public static class OutputConfigDto14 {
        /***/
        @KsYunField(name="Klog")
        private KlogDto15 Klog;

        @Data
        @ToString
        public static class KlogDto15 {
            /**Klog项目制名称*/
            @KsYunField(name="ProjectName")
            private String ProjectName;

            /**日志池名称*/
            @KsYunField(name="PoolName")
            private String PoolName;

        }

    }

}
