package org.self.plugins;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

@Mojo(name="sayhi")
public class GoalsExtends extends AbstractMojo{
	
	@Parameter(readonly=true)
	private String baseDir ;
	
	@Override
	public void execute() throws MojoExecutionException, MojoFailureException {
		if (baseDir == null) {
			throw new MojoExecutionException("the mojo sayhi's baseDir is null,please check it");
		}
		getLog().info("hello world");
	}

}
