package ksyun.client.iam.getprojectinstancelistnew.v20240513;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname GetProjectInstanceListNewRequest
 * @Description 请求参数
 */
@Data
public class GetProjectInstanceListNewRequest {
    /**
     * 项目id，不传入该参数时将会查询所有ProjectId对应的数据
     */
    @KsYunField(name = "ProjectId")
    private Integer ProjectId;

    /**
     * 资源类型标识
     */
    @KsYunField(name = "ProductLine")
    private String ProductLine;

    /**
     * 每页条数，默认10, 最大100条
     */
    @KsYunField(name = "Ps")
    private Integer Ps;

    /**
     * 页码。默认1
     */
    @KsYunField(name = "Pn")
    private Integer Pn;

}