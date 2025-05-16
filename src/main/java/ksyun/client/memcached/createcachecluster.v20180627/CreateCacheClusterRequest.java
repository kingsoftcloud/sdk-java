package ksyun.client.memcached.createcachecluster.v20180627;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname CreateCacheClusterRequest
 * @Description 请求参数
 */
@Data
public class CreateCacheClusterRequest {
    /**
     * 缓存服务名称             	 支持6-64个中文或者英文字符，包括汉字，大小写字母，数字，下划线和中划线
     */
    @KsYunField(name = "Name")
    private String Name;

    /**
     * 缓存容量大小，以GB为单位 	 缓存资源为单主从模式时，可选值为：{1, 2, 4, 8, 16, 32, 64}；
     */
    @KsYunField(name = "Capacity")
    private String Capacity;

    /**
     * 从节点个数据             	 范围是 0~7个， 默认值为0
     */
    @KsYunField(name = "SlaveNum")
    private String SlaveNum;

    /**
     * 网络类型                 	 固定值2， 目前只支持创建VPC实例。
     */
    @KsYunField(name = "NetType")
    private String NetType;

    /**
     * 虚拟专用网络             	 VPC网络ID，可在网络控制台获取。
     */
    @KsYunField(name = "VpcId")
    private String VpcId;

    /**
     * 终端子网id               	 终端子网ID，可在网络控制台获取（注意类型必须为终端子网）。
     */
    @KsYunField(name = "VnetId")
    private String VnetId;

    /**
     * 计费方式：默认为1        	 1:包年包月 5:按天先结
     */
    @KsYunField(name = "BillType")
    private String BillType;

    /**
     * 时长，默认值：1(单位:月) 	 billType=1(包年包月)则必填，最大支持范围是(1 ~36月)，开发自定
     */
    @KsYunField(name = "Duration")
    private String Duration;

    /**
     * 时长单位                 	 默认值：月
     */
    @KsYunField(name = "DurationUnit")
    private String DurationUnit;

    /**
     * 密码                     	 规则：(?=.*[A-Z]+.*)(?=.*[a-z]+.*)(?=.*[\d]+.*)([A-Za-z\d!@#$%^&*()_+=-]{8,30})
     */
    @KsYunField(name = "PassWord")
    private String PassWord;

    /**
     * 项目ID                   	 默认为0：默认项目
     */
    @KsYunField(name = "IamProjectId")
    private String IamProjectId;

    /**
     * 缓存服务引擎             	 取固定值：memcached
     */
    @KsYunField(name = "Engine")
    private String Engine;

}