package ksyun.client.vpc.deletesecondarycidrblock.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname DeleteSecondaryCidrBlockRequest
 * @Description 请求参数
 */
@Data
public class DeleteSecondaryCidrBlockRequest {
    /**
     * Vpc的ID
     */
    @KsYunField(name = "VpcId")
    private String VpcId;

    /**
     * Vpc附加网段的ID
     */
    @KsYunField(name = "SecondaryCidrId")
    private String SecondaryCidrId;

}