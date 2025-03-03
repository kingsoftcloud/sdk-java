package ksyun.client.tidb.createtask.v20210520;

import common.annotation.KsYunField;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * @Classname CreateTaskRequest
 * @Description 请求参数
 */
@Data
public class CreateTaskRequest {
    /**
     * 实例ID
     */
    @KsYunField(name = "InstanceId")
    private String InstanceId;

    /**
     * 任务名称，不可重复
     */
    @KsYunField(name = "TaskName")
    private String TaskName;

    /**
     * 目标端实例ID
     */
    @KsYunField(name = "TargetId")
    private String TargetId;

    /**
     * 目标端VpcId
     * 仅Kafka需要传，Mysql不需要
     */
    @KsYunField(name = "VpcId")
    private String VpcId;

    /**
     * 目标端VnetId
     * 仅Kafka需要传，Mysql不需要
     */
    @KsYunField(name = "VnetId")
    private String VnetId;

    /**
     * 目标端实例类型
     * 仅支持：MySQLKAFKA
     */
    @KsYunField(name = "TargetType")
    private String TargetType;

    /**
     * 目标端拓展信息
     * 若TargetType=MySQL，根据需要填写
     */
    @KsYunField(name = "TargetMySQL")

    private TargetMySQLDto TargetMySQLList;
    /**
     * 目标端拓展信息
     * 若TargetType=KAFKA，根据需要填写
     */
    @KsYunField(name = "TargetKafka")

    private TargetKafkaDto TargetKafkaList;

    @Data
    @ToString
    public static class TargetMySQLDto {
        /**
         * mysql 用户名
         */
        @KsYunField(name = "User")
        private String User;
        /**
         * 用户对应的密码
         */
        @KsYunField(name = "Passwd")
        private String Passwd;
        /**
         * 向下游执行SQL的并发度
         * 默认：16
         */
        @KsYunField(name = "WorkerCount")
        private Integer WorkerCount;
        /**
         * 向下游执行SQL的batch大小
         * 默认：256
         */
        @KsYunField(name = "MaxTxnRow")
        private Integer MaxTxnRow;
    }

    @Data
    @ToString
    public static class TargetKafkaDto {
        /**
         * Kafka版本
         */
        @KsYunField(name = "KafkaVersion")
        private String KafkaVersion;
        /**
         * topic 名称
         */
        @KsYunField(name = "TopicName")
        private String TopicName;
        /**
         * 信息协议：默认:canal-json
         * (default|canal-json|open-protocol|canal|avro|maxwell)
         */
        @KsYunField(name = "Protocol")
        private String Protocol;
        /**
         * 下游kafka partition数量
         * 默认：3
         */
        @KsYunField(name = "PartitionNum")
        private Integer PartitionNum;
        /**
         * 每次向kafka broker 发送消息的最大数据量
         * 默认：10485760
         */
        @KsYunField(name = "MaxMessageBytes")
        private Integer MaxMessageBytes;
        /**
         * kafka消息保存副本数
         * 默认：1
         */
        @KsYunField(name = "ReplicationFacter")
        private Integer ReplicationFacter;
        /**
         * mounter 线程数
         * 默认：16
         */
        @KsYunField(name = "MounterWorkerNum")
        private Integer MounterWorkerNum;
        /**
         * 域名列表
         */
        @KsYunField(name = "DomainList")
        private List<String> DomainListList;
        /**
         * 地址信息列表
         */
        @KsYunField(name = "EndpointList")
        private List<String> EndpointListList;
    }
}