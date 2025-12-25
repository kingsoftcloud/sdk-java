package ksyun.client.slb.listprivatelinkserver.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ListPrivateLinkServerRequest
* @Description 请求参数
*/
@Data
public class ListPrivateLinkServerRequest{
    /**PrivateLinkServer的ID*/
    @KsYunField(name="PrivateLinkServerId")
    private String PrivateLinkServerId;

    /**筛选Filter*/
    @KsYunField(name = "Filter", type = 1)
    private List<FilterDto> FilterList;

    @Data
    @ToString
    public static class FilterDto {
        /**有效值：
- connection-status，连接状态*/
        @KsYunField(name="Name")
        private String Name;

        /***/
        @KsYunField(name = "Value", type = 1)
        private List<String> ValueList;

    }

}
