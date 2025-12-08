package ksyun.client.kmr.listconfigurationhistory.v20210902;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ListConfigurationHistoryRequest
* @Description 请求参数
*/
@Data
public class ListConfigurationHistoryRequest{
    /**集群ID*/
    @KsYunField(name="ClusterId")
    private String ClusterId;

    /**服务名称：hdfs,mapreduce,yarn,gaea,zookeeper,spark,spark2,flink,flink1,hive,tez,presto,trino,oozie,sqoop,hue,zeppelin,hbase,kafka,knox,rocketmq,impala,iceberg,hudi,kudu,gatherer,prometheus,grafana,kerberos,ranger,dolphinscheduler,celeborn*/
    @KsYunField(name="ServiceName")
    private String ServiceName;

    /**分页信息*/
    @KsYunField(name="Marker")
    private String Marker;

}
