properties([
    parameters([
        string          (name: 'PERSON', defaultValue: 'Esteban', description: 'Who should we say hello to?'),
        text            (name: 'BIO', defaultValue: 'Linux Administrator and DevOps Engineer', description: 'Enter some information about the person.'),
        booleanParam    (name: 'GREET', defaultValue: true, description: 'Choose wether we should greet or not.'),
        choice          (name: 'OPTIONS', choices: ['Hello', 'Sup', 'Howdy'], description: 'Choose a greet option below:'),
        password        (name: 'PASSWORD', description: 'Enter a password:')
    ])
])

node {
    stage('Show Params Values'){
        wrap([$class: "MaskPasswordsBuildWrapper", varPasswordPairs: [[password: params.PASSWORD]]]){
            sh "echo ${params.PERSON}"
            //echo "\${params.PERSON}";
            //echo "\${params.BIO}";
            //echo "\${params.GREET}";
            //echo "\${params.OPTIONS}";
            //echo "\$params.PASSWORD"
            //'''
        }
    }
}