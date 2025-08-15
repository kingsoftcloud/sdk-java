package ksyun.client.kmr.listconfigurations.v20210902;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ListConfigurationsRequest @Description 请求参数
 */
@Data
public class ListConfigurationsRequest {
  /***/
  @KsYunField(name = "ClusterId")
  private String ClusterId;

  /**
   * 服务名称：hdfs,mapreduce,yarn,gaea,zookeeper,spark,spark2,flink,flink1,hive,tez,presto,trino,oozie,sqoop,hue,zeppelin,hbase,kafka,knox,rocketmq,impala,iceberg,hudi,kudu,gatherer,prometheus,grafana,kerberos,ranger,dolphinscheduler,celeborn
   */
  @KsYunField(name = "ServiceName")
  private String ServiceName;
}
