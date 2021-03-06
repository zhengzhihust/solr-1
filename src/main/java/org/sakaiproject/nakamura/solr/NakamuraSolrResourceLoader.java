package org.sakaiproject.nakamura.solr;

import org.apache.solr.core.SolrResourceLoader;

import java.io.InputStream;

public class NakamuraSolrResourceLoader extends SolrResourceLoader {

  static final String[] packages = {"","analysis.","schema.","handler.","search.","update.","core.","response.","request.","update.processor.","util.", "spelling.", "handler.component.", "handler.dataimport." };
  static final String project = "solr";
  static final String base = "org.apache" + "." + project;

  

  public NakamuraSolrResourceLoader( String instanceDir, ClassLoader parent ) {
    super(instanceDir,parent);
  }

  
  @Override
  public InputStream openResource(String resource) {
    InputStream in = this.getClass().getClassLoader().getResourceAsStream(resource);
    if ( in == null ) {
      in = super.openResource(resource);
    }
    return in;
  }

}
