node{
        stage 'build' 
        def deploy = openshiftDeploy apiURL: '<repl_env>', authToken: '', depCfg: 'frontend', namespace: '<repl_ns>', verbose: 'true', waitTime: '', waitUnit: 'sec'
}
