pipelineJob('DSL_Pipeline_test') {
  definition {
    cpsScm {
    	scm {
        git {
              remote {
                  github('vidu19/dsl_demo', 'https')
              }
              branch('master')
          }
    	}
        scriptPath('Jenkinsfile')
    }
  }
}
