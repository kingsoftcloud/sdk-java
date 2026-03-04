package ksyun.client.kce2.describenodes.v20230101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeNodesResponse
* @Description DescribeNodes 返回体
*/
@Data
@ToString
public class DescribeNodesResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**返回数据*/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /**每页最大数*/
        @JsonProperty("MaxResults")
        private Integer MaxResults;

        /**总数*/
        @JsonProperty("TotalCount")
        private Integer TotalCount;

        /***/
        @JsonProperty("InstanceSet")
        private List<DataInstanceSetDto> InstanceSet;

        @Data
        @ToString
        public static class DataInstanceSetDto {
            /**机器类型 
• KEC 云主机
• EPC 裸金属*/
            @JsonProperty("Provider")
            private String Provider;

            /**节点安装组件信息*/
            @JsonProperty("Components")
            private List<DataInstanceSetComponentsDto> Components;

            @Data
            @ToString
            public static class DataInstanceSetComponentsDto {
                /**核心组件的类型
• APISERVER
• ETCD
• CONTROLLERMANAGER
• EVENTETCD
• SCHEDULER*/
                @JsonProperty("Type")
                private String Type;

            }

            /**实例 id*/
            @JsonProperty("InstanceId")
            private String InstanceId;

            /**节点 id*/
            @JsonProperty("KceNodeId")
            private String KceNodeId;

            /**节点名称*/
            @JsonProperty("Name")
            private String Name;

            /**集群Id*/
            @JsonProperty("ClusterId")
            private String ClusterId;

            /**节点状态*/
            @JsonProperty("Status")
            private DataInstanceSetStatusDto Status;

            @Data
            @ToString
            public static class DataInstanceSetStatusDto {
                /**节点状态
• Creating   创建中
• CreateFailed 创建失败
• Error  实例异常
• Disable  不可用
• RemoveError  移出异常
• WaitScriptExecute   等待脚本执行
• Reinstalling   实例重装中
• Running   运行中
• Removing 移出中*/
                @JsonProperty("Phase")
                private String Phase;

                /**节点错误信息*/
                @JsonProperty("Message")
                private String Message;

            }

            /**k8s节点配置*/
            @JsonProperty("AdvancedSetting")
            private DataInstanceSetAdvancedSettingDto AdvancedSetting;

            @Data
            @ToString
            public static class DataInstanceSetAdvancedSettingDto {
                /**部署前执行脚本（base64编码）*/
                @JsonProperty("PostUserScript")
                private String PostUserScript;

                /**部署后执行脚本（base64编码）*/
                @JsonProperty("PreUserScript")
                private String PreUserScript;

                /**标签信息*/
                @JsonProperty("Labels")
                private DataInstanceSetAdvancedSettingLabelsDto Labels;

                @Data
                @ToString
                public static class DataInstanceSetAdvancedSettingLabelsDto {
                    /***/
                    @JsonProperty("Key")
                    private String Key;

                    /***/
                    @JsonProperty("Value")
                    private String Value;

                }

                /**污点信息*/
                @JsonProperty("Taint")
                private DataInstanceSetAdvancedSettingTaintDto Taint;

                @Data
                @ToString
                public static class DataInstanceSetAdvancedSettingTaintDto {
                    /***/
                    @JsonProperty("Key")
                    private String Key;

                    /***/
                    @JsonProperty("Value")
                    private String Value;

                    /***/
                    @JsonProperty("Effect")
                    private String Effect;

                }

            }

            /**节点基础信息*/
            @JsonProperty("BasicSetting")
            private DataInstanceSetBasicSettingDto BasicSetting;

            @Data
            @ToString
            public static class DataInstanceSetBasicSettingDto {
                /**可用区信息*/
                @JsonProperty("AvailabilityZone")
                private String AvailabilityZone;

                /**镜像id，镜像支持请查看https://365.kdocs.cn/l/ctu8UNu13xbz

*/
                @JsonProperty("ImageID")
                private String ImageID;

                /**安全组Id*/
                @JsonProperty("SecurityGroupID")
                private String SecurityGroupID;

                /**实例的子网id*/
                @JsonProperty("SubnetID")
                private String SubnetID;

                /**实例类型*/
                @JsonProperty("InstanceType")
                private String InstanceType;

                /**Epc的类型
• GPU  gpu类型
• CAL  计算型*/
                @JsonProperty("Series")
                private String Series;

                /**系统盘信息*/
                @JsonProperty("SystemDisk")
                private DataInstanceSetBasicSettingSystemDiskDto SystemDisk;

                @Data
                @ToString
                public static class DataInstanceSetBasicSettingSystemDiskDto {
                    /**epc系统盘类型 （默认值EXT4）
• EXT4
• XFS*/
                    @JsonProperty("FileSystem")
                    private String FileSystem;

                    /**系统盘类型*/
                    @JsonProperty("Type")
                    private String Type;

                    /**系统盘大小*/
                    @JsonProperty("Size")
                    private Integer Size;

                }

                /**数据盘信息*/
                @JsonProperty("DataDisk")
                private List<DataInstanceSetBasicSettingDataDiskDto> DataDisk;

                @Data
                @ToString
                public static class DataInstanceSetBasicSettingDataDiskDto {
                    /**epc数据盘类型
• EXT4
• XFS*/
                    @JsonProperty("FileSystem")
                    private String FileSystem;

                    /**epc数据盘目录
• /DATA/disk    在系统的DATA目录下，系统里展示内容如/DATA/disk1，/DATA/disk2
• /data    在系统的根目录下，系统里展示内容从/data1开始，如/data1，/data2
• /ssd*/
                    @JsonProperty("MountTarget")
                    private String MountTarget;

                    /**数据盘配置*/
                    @JsonProperty("Type")
                    private String Type;

                    /**数据盘大小，单位：G*/
                    @JsonProperty("Size")
                    private Integer Size;

                    /**是否随实例删除*/
                    @JsonProperty("DeleteWithInstance")
                    private Boolean DeleteWithInstance;

                    /**是否格式化并挂载,默认挂载在/data目录下，用ext4的文件格式挂载*/
                    @JsonProperty("AutoFormatAndMount")
                    private Boolean AutoFormatAndMount;

                }

                /**计费方式（新建实例为必填项）
• monthly 包年包月
• dailysettlement 按量付费（按日月结）
• hourlyInstantSettlement(按小时结）*/
                @JsonProperty("ChargeType")
                private String ChargeType;

                /**购买时长单位，当计费方式为包年包月时必填
• 2  单位月*/
                @JsonProperty("Unit")
                private Integer Unit;

                /**购买时长*/
                @JsonProperty("PurchaseTime")
                private Integer PurchaseTime;

                /**epc专有
数据盘Raid级别,和数据盘的数量直接相关（新建节点必填）
有效值： Raid1：数据盘数量必须是2的倍数
Raid5：数据盘的数量必须大于等于3
Raid10：数据盘数量必须是4的倍数
Raid50：数据盘的数量必须大于6且是2的倍数
SRaid0：单盘SRaid0无限制，仅针对大数据业务自身有冗*/
                @JsonProperty("Raid")
                private String Raid;

                /**epc专有
网卡模式
有效值：
bond4：BOND模式
single：非BOND模式
dual：双网卡模式
windows创建时，只支持非bond模式。*/
                @JsonProperty("NetworkInterfaceMode")
                private String NetworkInterfaceMode;

                /**epc专有
bond名称
有效值： 
• bond0（默认值）
• bond1*/
                @JsonProperty("BondName")
                private String BondName;

                /**epc 专有
gpu的驱动id 
*/
                @JsonProperty("GpuImageDriverId")
                private String GpuImageDriverId;

            }

            /**创建时间*/
            @JsonProperty("CreatedTime")
            private String CreatedTime;

            /**更新时间*/
            @JsonProperty("UpdatedTime")
            private String UpdatedTime;

        }

    }

}
