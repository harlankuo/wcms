package ${package};
<#list imports as items>
import ${items};
</#list>
public class ${className} {

	<#list  columns as property>
		private ${property.type} ${property.name};		//${property.comment}
	</#list>
	
	<#list columns as property>
		public ${property.type} get<@upper>${property.name}</@upper>() {
			return this.${property.name};
		}
		
		public void set<@upper>${property.name}</@upper>(${property.type}  ${property.name}) {
			this.${property.name} = ${property.name};
		}
	</#list>
}