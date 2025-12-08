package ksyun.client.postgresql.modifydbinstancespec.v20181225;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ModifyDBInstanceSpecRequest
* @Description 请求参数
*/
@Data
public class ModifyDBInstanceSpecRequest{
    /**实例ID*/
    @KsYunField(name="DBInstanceIdentifier")
    private String DBInstanceIdentifier;

    /**内存大小，客户只能购买特定规格的套餐，且需>=原规格.否则将会报错    注:各规格对应连接数和iops见下方附表.

| 实例规格 | 最大连接数 | 读IOPS | 写IOPS | 对应磁盘取值范围(步长均为5) |
| :- | - | - | - | - |
| **1G** | 200 | 1200 | 1200 | *5~40* |
| **2G** | 400 | 2400 | 2400 | *5~80* |
| **4G** | 800 | 4800 | 4800 | *5~200* |
| **8G** | 1600 | 9600 | 9600 | *5~300* |
| **12G** | 2400 | 14400 | 14400 | *5~500* |
| **16G** | 3200 | 19200 | 19200 | *5~600* |
| **24G** | 4800 | 28800 | 28800 | *5~1000* |
| **32G** | 6400 | 38400 | 38400 | *5~1500* |
| **48G** | 9600 | 57600 |  57600 | *5~2000* |*/
    @KsYunField(name="Mem")
    private Integer Mem;

    /**磁盘大小，客户只能购买特定规格的套餐，单位为G,同规格内存只支持升配磁盘.否则将会报错    注:各配置取值范围见下方附表

| 实例规格 | 最大连接数 | 读IOPS | 写IOPS | 对应磁盘取值范围(步长均为5) |
| :- | - | - | - | - |
| **1G** | 200 | 1200 | 1200 | *5~40* |
| **2G** | 400 | 2400 | 2400 | *5~80* |
| **4G** | 800 | 4800 | 4800 | *5~200* |
| **8G** | 1600 | 9600 | 9600 | *5~300* |
| **12G** | 2400 | 14400 | 14400 | *5~500* |
| **16G** | 3200 | 19200 | 19200 | *5~600* |
| **24G** | 4800 | 28800 | 28800 | *5~1000* |
| **32G** | 6400 | 38400 | 38400 | *5~1500* |
| **48G** | 9600 | 57600 |  57600 | *5~2000* |*/
    @KsYunField(name="Disk")
    private Integer Disk;

}
