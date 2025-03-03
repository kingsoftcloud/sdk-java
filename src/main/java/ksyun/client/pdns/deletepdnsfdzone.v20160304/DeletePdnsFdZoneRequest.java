package ksyun.client.pdns.deletepdnsfdzone.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeletePdnsFdZoneRequest
 * @Description 请求参数
 */
@Data
public class DeletePdnsFdZoneRequest {
    /**
     * 出站节点的ID
     */
    @KsYunField(name = "FdZoneId")
    private String FdZoneId;

}