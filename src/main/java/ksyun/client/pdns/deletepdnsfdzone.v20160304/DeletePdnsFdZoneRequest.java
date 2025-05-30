package ksyun.client.pdns.deletepdnsfdzone.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

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