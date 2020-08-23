package scripts

import importPack.ReadyMethod as RM


def display(parameter) {
	println "Sum of entered data is : $parameter"
}

def sum=RM.sum(2, 3)

display(sum)


