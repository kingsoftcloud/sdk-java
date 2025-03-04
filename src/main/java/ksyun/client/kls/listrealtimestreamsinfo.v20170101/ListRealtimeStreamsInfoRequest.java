package ksyun.client.kls.listrealtimestreamsinfo.v20170101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ListRealtimeStreamsInfoRequest
 * @Description 请求参数
 */
@Data
public class ListRealtimeStreamsInfoRequest {
    /**
     * 域名空间
     */
    @KsYunField(name = "UniqueName")
    private String UniqueName;

    /**
     * 应用名
     */
    @KsYunField(name = "App")
    private String App;

    /**
     * 流名，只支持输入单个流名
     */
    @KsYunField(name = "Stream")
    private String Stream;

    /**
     * 拉流域名ID，缺省为UniqueName下全部拉流域名，可输入需要查询的拉流域名ID，支持批量域名查询，多个域名ID用逗号（半角）分隔
     */
    @KsYunField(name = "DomainIds")
    private String DomainIds;

    /**
     * 返回拉流信息协议类型，**默认http+flv**，http flv协议在线人数和带宽；**rtmp**，rtmp协议在线人数和带宽；**hls**：返回hls协议在线人数和带宽
     */
    @KsYunField(name = "PullProtocol")
    private String PullProtocol;

    /**
     * 返回信息类型， 缺省：返回推拉流信息的交集，push，只返回推流信息，pull：只返回拉流信息
     */
    @KsYunField(name = "Type")
    private String Type;

}