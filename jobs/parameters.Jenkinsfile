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
        withCredentials([string(credentialsId: 'mySecret', variable: 'MY_SECRET', passwordVariable: 'PASSWORD')]){
            echo '''
            "${params.PERSON}"
            "${params.BIO}"
            "${params.GREET}"
            "${params.OPTIONS}"
            "${MASKED_MY_SECRET}"
            '''
        }
    }
}