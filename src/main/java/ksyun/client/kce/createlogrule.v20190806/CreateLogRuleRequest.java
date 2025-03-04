package ksyun.client.kce.createlogrule.v20190806;

import common.annotation.KsYunField;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * @Classname CreateLogRuleRequest
 * @Description 请求参数
 */
@Data
public class CreateLogRuleRequest {
    /**
     * 集群Id
     */
    @KsYunField(name = "ClusterId")
    private String ClusterId;

    /**
     * 日志规则名称
     * - 不超过40个字符，只能包含小写字母、数字及分隔符("-"、"_"、".")，且必须以小写字母、数字开头和结尾
     */
    @KsYunField(name = "RuleName")
    private String RuleName;

    /**
     * 日志源
     */
    @KsYunField(name = "InputConfig")

    private InputConfigDto InputConfigList;
    /**
     * 消费端
     */
    @KsYunField(name = "OutputConfig")

    private OutputConfigDto OutputConfigList;

    @Data
    @ToString
    public static class InputConfigDto {
        /**
         * 日志类型
         * - 1：容器标准输出
         * - 2：容器文件路径
         * - 3：主机文件路径
         */
        @KsYunField(name = "InputType")
        private Integer InputType;
        /**
         * 如果InputType=1，则该项必填
         */
        @KsYunField(name = "ContainerStandout")
        private ContainerStandoutDto ContainerStandoutList;
        /**
         * 容器文件路径，如果 InputType=2，则该项必填
         */
        @KsYunField(name = "ContainerFile")
        private ContainerFileDto ContainerFileList;
        /**
         * 主机文件路径，如果 InputType=3，则该项必填
         */
        @KsYunField(name = "HostFile")
        private HostFileDto HostFileList;

        @Data
        @ToString
        public static class ContainerStandoutDto {
            /**
             * 日志源
             * - 是否采集所有容器
             */
            @KsYunField(name = "AllContainer")
            private Boolean AllContainer;
            /**
             * 指定负载采集
             * - 如果 AllContainer 为false，SpecifiedWorkload 或 SpecifiedPodLabel 必须指定一项
             */
            @KsYunField(name = "SpecifiedWorkload")
            private SpecifiedWorkloadDto SpecifiedWorkloadList;
            /**
             * 指定PodLable采集
             * - 如果 AllContainer 为false，SpecifiedWorkload 或 SpecifiedPodLabel 必须指定一项
             */
            @KsYunField(name = "SpecifiedPodLabel")
            private SpecifiedPodLabelDto SpecifiedPodLabelList;

            @Data
            @ToString
            public static class SpecifiedWorkloadDto {
                /***/
                @KsYunField(name = "NamespaceList")
                private List<Object> NamespaceListList;
            }

            @Data
            @ToString
            public static class SpecifiedPodLabelDto {
                /**
                 * 选择命名空间方式，有效值：1、2
                 * - 1：指定命名空间
                 * - 2：排除命名空间
                 */
                @KsYunField(name = "NamespaceOperator")
                private Integer NamespaceOperator;
                /**
                 * 命名空间集合，如果NamespaceOperator=2，该项为必填
                 */
                @KsYunField(name = "Namespace")
                private List<String> NamespaceList;
                /**
                 * 容器名称操作类型，如果ContainerName不为空，则该值为必填项。有效值：1、2
                 * - 1：包含
                 * - 2：不包含
                 */
                @KsYunField(name = "ContainerNameOperator")
                private Integer ContainerNameOperator;
                /**
                 * 容器名称
                 */
                @KsYunField(name = "ContainerName")
                private String ContainerName;
                /***/
                @KsYunField(name = "ContainerLabel")
                private List<Object> ContainerLabelList;
            }
        }

        @Data
        @ToString
        public static class ContainerFileDto {
            /**
             * 指定容器
             */
            @KsYunField(name = "SpecifiedContainer")
            private SpecifiedContainerDto SpecifiedContainerList;
            /**
             * 指定 PodLabel
             */
            @KsYunField(name = "SpecifiedPodLabel")
            private SpecifiedPodLabelDto SpecifiedPodLabelList;

            @Data
            @ToString
            public static class SpecifiedContainerDto {
                /**
                 * 所属命名空间，如果 SpecifiedPodLabel 不为空，则该项必填
                 */
                @KsYunField(name = "Namespace")
                private String Namespace;
                /**
                 * 负载类型
                 * - Deployment
                 * - DaemonSet
                 * - StatefulSet
                 * - Job
                 */
                @KsYunField(name = "WorkloadType")
                private String WorkloadType;
                /**
                 * 负载名称
                 */
                @KsYunField(name = "WorkloadName")
                private String WorkloadName;
                /**
                 * 容器名称
                 */
                @KsYunField(name = "ContainerName")
                private String ContainerName;
                /**
                 * 设置要采集的日志文件的绝对路径，不支持通配符“*”
                 */
                @KsYunField(name = "ContainerPath")
                private String ContainerPath;
            }

            @Data
            @ToString
            public static class SpecifiedPodLabelDto {
                /**
                 * 选择命名空间方式，有效值：1、2
                 * - 1：指定命名空间
                 * - 2：排除命名空间
                 */
                @KsYunField(name = "NamespaceOperator")
                private Integer NamespaceOperator;
                /**
                 * 命名空间集合
                 */
                @KsYunField(name = "Namespace")
                private List<String> NamespaceList;
                /**
                 * 容器名称操作类型，有效值：1、2
                 * - 1：包含
                 * - 2：不包含
                 */
                @KsYunField(name = "ContainerNameOperator")
                private Integer ContainerNameOperator;
                /**
                 * 容器名称
                 */
                @KsYunField(name = "ContainerName")
                private String ContainerName;
                /**
                 * 设置要采集的日志文件的绝对路径，不支持通配符“*”
                 */
                @KsYunField(name = "ContainerPath")
                private List<String> ContainerPathList;
                /***/
                @KsYunField(name = "ContainerLabel")
                private List<Object> ContainerLabelList;
            }
        }

        @Data
        @ToString
        public static class HostFileDto {
            /**
             * 设置要采集的日志文件的绝对路径，不支持通配符“*”
             */
            @KsYunField(name = "Path")
            private String Path;
            /***/
            @KsYunField(name = "Label")
            private List<Object> LabelList;
        }
    }

    @Data
    @ToString
    public static class OutputConfigDto {
        /***/
        @KsYunField(name = "Klog")
        private KlogDto KlogList;

        @Data
        @ToString
        public static class KlogDto {
            /**
             * Klog项目制名称
             */
            @KsYunField(name = "ProjectName")
            private String ProjectName;
            /**
             * 日志池名称
             */
            @KsYunField(name = "PoolName")
            private String PoolName;
        }
    }
}