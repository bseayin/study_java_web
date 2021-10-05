package com.xsz;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

public class CodeGeneration {

    //main函数
    public static void main(String[] args) {

        AutoGenerator autoGenerator = new AutoGenerator();

        //全局配置
        GlobalConfig gc = new GlobalConfig();

        //得到当前项目的路径
        String oPath = System.getProperty("user.dir");

        //生成文件输出根目录
//        gc.setOutputDir(oPath + "/src/main/java");
        //if project is module，add module name
        gc.setOutputDir(oPath + "/mybatisPlusGeneratorDemo/src/main/java");

        //生成完成后不弹出文件框
        gc.setOpen(false);

        //文件覆盖
        gc.setFileOverride(true);

        // 不需要ActiveRecord特性的请改为false
        gc.setActiveRecord(false);

        // XML 二级缓存
        gc.setEnableCache(false);

        // XML ResultMap
        gc.setBaseResultMap(true);

        // XML columList
        gc.setBaseColumnList(false);

        // 作者
        gc.setAuthor("bsea");
        gc.setSwagger2(true);

        // 自定义文件命名，注意 %s 会自动填充表实体属性！
        gc.setControllerName("%sController");
        gc.setServiceName("%sService");
        gc.setServiceImplName("%sServiceImpl");
        gc.setMapperName("%sMapper");
        gc.setXmlName("%sMapper");
        gc.setEntityName("%sVo");
        autoGenerator.setGlobalConfig(gc);

        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();

        //设置数据库类型
        dsc.setDbType(DbType.MYSQL);

        dsc.setDriverName("com.mysql.cj.jdbc.Driver");

        //用户名
        dsc.setUsername("root");

        //密码
        dsc.setPassword("XSZ202006a");

        //指定数据库
        dsc.setUrl("jdbc:mysql://127.0.0.1:3306/db_seckill?useUnicode=true&characterEncoding=UTF-8&serverTimezone=Asia/Shanghai&nullCatalogMeansCurrent=true");
        autoGenerator.setDataSource(dsc);

        // 策略配置
        StrategyConfig strategy = new StrategyConfig();

        // 表名生成策略
        strategy.setNaming(NamingStrategy.underline_to_camel);

        // 需要生成的表
//        strategy.setInclude(new String[]{"an_users","an_activity"});
        strategy.setInclude(new String[]{"t_user"});
        strategy.setSuperServiceClass(null);
        strategy.setSuperServiceImplClass(null);
        strategy.setSuperMapperClass(null);
        strategy.setEntityLombokModel(true);

        //去除表前缀
        strategy.setTablePrefix("an_");
        //去除字段前缀
        strategy.setFieldPrefix("");
        autoGenerator.setStrategy(strategy);

        // 包配置
        PackageConfig pc = new PackageConfig();
        //父包路径
        pc.setParent("com.xsz.seckill");
        pc.setController("controller");
        pc.setService("service");
        pc.setServiceImpl("service.impl");
        pc.setMapper("mapper");
        pc.setEntity("vo");
        pc.setXml("mapper");
        autoGenerator.setPackageInfo(pc);
        // 执行生成
        autoGenerator.execute();
    }
}
