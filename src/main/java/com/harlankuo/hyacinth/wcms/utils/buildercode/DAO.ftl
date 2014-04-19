package ${package};

import net.paoding.rose.jade.annotation.DAO;
import net.paoding.rose.jade.annotation.ReturnGeneratedKeys;
import net.paoding.rose.jade.annotation.SQL;
import java.util.List;
<#list imports as items>
import ${items};
</#list>
@DAO
public interface ${className}DAO {

	@SQL("select * from ${className} where id=:1")
    public ${className} getById(int id);
	
	@SQL("select * from ${className} ##(:1)")
    public List<${className}> findByModel(String strWhere);
	
    @SQL("select * from ${className}")
    public List<${className}> findAll();
    
    @SQL("select * from ${className} ##(:1) order by ADDTIME desc  limit :2,:3")
    public List<${className}> findPageByModel(String strWhere, int start, int rows);
    
    @SQL("insert into ${className} (${property}) values (${v_property})")
    public int save(${className} model);
    
    @SQL("insert into ${className} (${property}) values (${v_property})")
    public int save(List<${className}> model);
   
    @SQL("update ${className} set  ${u_property}")
    public int update(${className} model);

    @SQL("delete from ${className} where id = :1 ")
    public int delete(long id);
    
    @SQL("select count(id) from ${className} ##(:1)")
    public int count(String strWhere);
}