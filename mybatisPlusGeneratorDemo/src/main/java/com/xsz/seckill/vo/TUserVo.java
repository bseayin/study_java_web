package com.xsz.seckill.vo;

import com.baomidou.mybatisplus.annotation.TableName;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author bsea
 * @since 2021-10-05
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("t_user")
@ApiModel(value="TUserVo对象", description="")
public class TUserVo implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "手机号码")
      private Long id;

    private String nickname;

    @ApiModelProperty(value = "m5(md5(明文+固定salt)+salt)")
    private String password;

    private String salt;

    @ApiModelProperty(value = "头像")
    private String head;

    @ApiModelProperty(value = "注册时间")
    private LocalDateTime registerDate;

    @ApiModelProperty(value = "最后登录时间")
    private LocalDateTime lastLoginDate;

    @ApiModelProperty(value = "登录次数")
    private Integer loginCount;


}
