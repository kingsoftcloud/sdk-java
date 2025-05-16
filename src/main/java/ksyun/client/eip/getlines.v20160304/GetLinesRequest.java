package ksyun.client.eip.getlines.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname GetLinesRequest
 * @Description 请求参数
 */
@Data
public class GetLinesRequest {
    /**
     * 线路类型的ID
     */
    @KsYunField(name = "Uuid")
    private String Uuid;

    /**
     * 线路LineName
     */
    @KsYunField(name = "Name")
    private String Name;

    /**
     * IpVersion版本，不传查询所有的，ipv6|ipv4
     */
    @KsYunField(name = "IpVersion")
    private String IpVersion;

    /**
     * LineType，线路类型，例如:Public
     */
    @KsYunField(name = "Type")
    private String Type;

}