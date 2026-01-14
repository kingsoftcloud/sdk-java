package ksyun.client.kfw.modifycfwacl.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ModifyCfwAclRequest
* @Description 请求参数
*/
@Data
public class ModifyCfwAclRequest{
    /**访问控制策略id*/
    @KsYunField(name="AclId")
    private String AclId;

    /**防火墙id*/
    @KsYunField(name="CfwInstanceId")
    private String CfwInstanceId;

    /**访问控制名称*/
    @KsYunField(name="AclName")
    private String AclName;

    /**出入向(入向：in, 出向：out)*/
    @KsYunField(name="Direction")
    private String Direction;

    /**源地址类型(IP：ip|地址簿：addrbook|地域：zone|Any：any)*/
    @KsYunField(name="SrcType")
    private String SrcType;

    /**源ip，当SrcType为ip时必填
仅支持填写公网IPv4地址，支持IP地址段、IP地址范围。通过英文",“隔开，格式为：10.1.1.1/32,10.1.1.2/24,192.168.1.1-192.168.1.63”
1、地址段：可输入多个IP+掩码，中间通过英文逗号“,”隔开如192.168.1.1/32,110.1.1.1/24。
2、地址范围：多个连续的IP地址，中间通过"-"隔开如192.168.1.1–192.168.1.253*/
    @KsYunField(name="SrcIps",type=2)
    private List<String> SrcIpsList;

    /**地址簿id集合，当SrcType为addrbook时必填*/
    @KsYunField(name="SrcAddrbooks",type=2)
    private List<String> SrcAddrbooksList;

    /**源地址地域，当SrcType为zone时必填，示例[{“areaCode”:“CN_HB”,“areaName”:“湖北省”}]*/
    @KsYunField(name="SrcZones",type=2)
    private List<SrcZonesDto> SrcZonesList;

    @Data
    @ToString
    public static class SrcZonesDto {
        /**地区编码*/
        @KsYunField(name="AreaCode")
        private String AreaCode;

        /**地区名称*/
        @KsYunField(name="AreaName")
        private String AreaName;

        /**子节点*/
        @KsYunField(name="SubAreas")
        private SrcZonesSubAreasDto SubAreas;

        @Data
        @ToString
        public static class SrcZonesSubAreasDto {
            /**地区编码*/
            @KsYunField(name="AreaCode")
            private String AreaCode;

            /**地域名称*/
            @KsYunField(name="AreaName")
            private String AreaName;

        }

    }

    /**目的类型：（IP：ip，地址簿：addrbook，地域：zone，域名簿：hostbook，域名：host，Any：any）*/
    @KsYunField(name="DestType")
    private String DestType;

    /**目的ip，当DestType为ip时必填
仅支持填写公网IPv4地址，支持IP地址段、IP地址范围。通过英文",“隔开，格式为：10.1.1.1/32,10.1.1.2/24,192.168.1.1-192.168.1.63”
1、地址段：可输入多个IP+掩码，中间通过英文逗号“,”隔开如192.168.1.1/32,110.1.1.1/24。
2、地址范围：多个连续的IP地址，中间通过"-"隔开如192.168.1.1–192.168.1.253*/
    @KsYunField(name="DestIps",type=2)
    private List<String> DestIpsList;

    /**目的地址簿id集合，当DestType为addrbook时必填*/
    @KsYunField(name="DestAddrbooks",type=2)
    private List<String> DestAddrbooksList;

    /**目的地址地域，当DestType为zone时必填，示例[{“areaCode”:“CN_HB”,“areaName”:“湖北省”}]*/
    @KsYunField(name="DestZones",type=2)
    private List<DestZonesDto> DestZonesList;

    @Data
    @ToString
    public static class DestZonesDto {
        /**地区编码*/
        @KsYunField(name="AreaCode")
        private String AreaCode;

        /**地区名称*/
        @KsYunField(name="AreaName")
        private String AreaName;

        /**子节点*/
        @KsYunField(name="SubAreas")
        private DestZonesSubAreasDto SubAreas;

        @Data
        @ToString
        public static class DestZonesSubAreasDto {
            /**地区编码*/
            @KsYunField(name="AreaCode")
            private String AreaCode;

            /**地区名称*/
            @KsYunField(name="AreaName")
            private String AreaName;

        }

    }

    /**域名，目前只允许传一个域名，泛域名示例*.ksyun.con，完整域名示例uss.ksyun.com*/
    @KsYunField(name="DestHost",type=2)
    private List<String> DestHostList;

    /**域名簿id集合，目前只允许传一个*/
    @KsYunField(name="DestHostbook",type=2)
    private List<String> DestHostbookList;

    /**服务类型，服务：service，服务组：servicegroup，Any：any*/
    @KsYunField(name="ServiceType")
    private String ServiceType;

    /**服务信息，ServiceType为service时必填，（协议:源端口最小-源端口最大/目的最小-目的最大 ）例：TCP:1-100/2-200,UDP:22/33,ICMP*/
    @KsYunField(name="ServiceInfos",type=2)
    private List<String> ServiceInfosList;

    /**服务组id集合，ServiceType为servicegroup时必填*/
    @KsYunField(name="ServiceGroups",type=2)
    private List<String> ServiceGroupsList;

    /**app|any*/
    @KsYunField(name="AppType")
    private String AppType;

    /**AppType为app时必填，TCP支持的应用集合(“HTTP”, “HTTPS”, “SMTP”, “SMTPS”, “IMAP4”, “MYSQL”,“POP3”, “POP3S”, “SSH”, “TLS1”, “VNC”, “DNS”, “RDP”)，UDP支持的应用集合(“DNS”, “RDP”)，ICMP只能填any*/
    @KsYunField(name="AppValue",type=2)
    private List<String> AppValueList;

    /**动作，允许：accept，拒绝：deny*/
    @KsYunField(name="Policy")
    private String Policy;

    /**开启：start，关闭：stop*/
    @KsYunField(name="Status")
    private String Status;

    /**描述*/
    @KsYunField(name="Description")
    private String Description;

}
