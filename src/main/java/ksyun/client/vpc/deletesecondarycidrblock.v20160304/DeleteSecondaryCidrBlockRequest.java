package ksyun.client.vpc.deletesecondarycidrblock.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

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