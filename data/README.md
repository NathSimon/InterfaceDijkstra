# Explication de l'éxécution du projet labyrinthe :

Projet de JAVA de première année

Nathanaël SIMON

Encadrant : Patrick Bellot - Télécom Paris

Ce projet demande l'intégration de l'algorithme de Djikstra dans une interface graphique, simple et intuitve pour l'utilisateur. D'autres fonctionnalités ont été implémentées pour complémenter le projet. Une attention particulière aux bonnes pratiques de programmation orientée objet a été apportée dans la réalisation.

##Utilisation de l'interface graphique


###Utilisation principale

L'interface se divise en 3 parties. 

#### Paneau de contrôle
Paneau qui permet le contrôle de la plupart des fonctionnalités du labyrithe. 
##### Boutons de séléction
Sélection des différents types de blocs. Il est possible de séléctionner le départ, l'arrivée, et les murs. Le bouton mur permet d'ajouter, ou d'enlever un mur en cliquant. Une seule arrivée et un seul départ sont autorisée dans le labyrithe. Un indicateur du boutton séléctionné est affiché.
##### Séléction de la taille du labyrinthe
Champs de textes permettant d'entrer la taille du labyrinthe souhaitée. Celle ci doit être comprise en 4 et 100 pour des raisons arbitraire de facilité d'utilisation. Un changement de taille se fait par la préssion de la touche entrée après avoir séléctionné la nouvelle taille, et remet l'entièreté du labyrinthe dans sa configuration initiale. 

Deux types d'erreurs sont générés. 

Input size : la taille entrée n'est pas comprise entre 4 et 100.

Input format : la taille entrée possède des caractères qui ne sont pas de chiffres. ATTENTION, les espaces génèrent cette erreur.
##### Boutton de switch
Ces deux boutton sont alternantifs à chaque clique sur l'un deux. 

AUTO/MANUAL : Permet de changer le mode de résolution du labyrinthe. Automatique = Résolution à chaque modification du labyrinthe, mur, départ, ou arrivé. Manuel = résolution du labyrinthe à chaque pression du boutton "solve". 

Ces modes permettent une facilité d'utilisation dans les labyrinthes de petite taille, et en mode manuel dans les labyrinthes de grande taille.

Color : Permet de changer la couleur des bordures des cases du labyrinthe. Cela peut permettre d'aider à la lisibilité du labyrinthe pour certains utilisateurs.

Ces deux bouttons  possèdent des indicateurs textuels expicatifs pour l'utilisateur.

##### Solve/Reset
Solve : boutton permettant de résoudre le labyrinthe. Génère des erreurs si il n'y a pas d'arrivée ou de départ, ou si il n'existe pas de résolution du labyrinthe, et en informe l'utilisateur. 

Reset : boutton permettant de réinitialisé le labyrinthe aux dimensions actuellements séléctionnées par l'utilisateur. Demande la confirmation de l'utilisateur avant de s'effectuer.

#### Paneau central

Affichage du labyrinthe. En fonction du type de case sélectionné, affichage d'un mur, d'herbes ou de textes départ / arrivé. Le chemin réalisé par le labyrinthe est affiché en rouge entre les points de départ et d'arrivés.

#### Menus déroulants
Ces menus déroulants permettent d'acceder à d'autres fonctionnalités, répertoriées par catégories.

##### File
Import from file : Déscription à la fin de ce document.

Save to file : Déscription à la fin de ce document.

Quit : Ferme l'application.

##### Maze
Put every box to wall : permet de changer toutes les cases du labyrinthe en mur.

Put every box to empty : permet de changer toutes les cases du labyrinthe en chemin possible.

Solve : Boutton fonctionnant de la même façon que celui du panneau de contrôle.

Reset : Boutton fonctionnant de la même façon que celui du panneau de contrôle.

##### Display
Switch border color to : Boutton fonctionnant de la même façon que celui du panneau de contrôle.

Minimize : Minimise la taille d'affichage de l'application vers une valeur prédéfinie.

Maximize : Maximise la taille d'affichage de l'applcation en plein écran. 

##Import from file

Génération d'une fenetre permettant l'importation d'un l'labyrinthe déjà fait.

### Input

Le programme accepte un fichier au format .txt . Le labyrinthe sera décrit comme un bloc rectangulaire uniquement. Les seuls caractères autorisés sont les suivants. 

Le fichier doit être OBLIGATOIREMENT positionné dans le fichier du projet. 
Il est ensuite possible d'entrer le nom du fichier. Le programme génère une erreur si il ne trouve pas le fichier.

### Types de case

- W : case de mur
- E : case vide
- D : case de départ. Il ne peut en avoir qu'une.
- A : case d'arrivée. Il ne peut en avoir qu'une.

### Erreurs possibles 
Le programme génère les erreurs en fonction du fichier texte fourni, et reprends celles demandées lors des TPs.

Erreur de taille/de nombre d'entrées sorties/de caractère inconnu.

### Exemple de labyrinthe
`WWWWW`

`EDEEE`

`WWWWE`

`EEEEE`

`AEEEW`



##Save to file

Génération d'une fenetre permettant l'exportation dans un fichier texte du labyrinthe affiché.

Le fichier sera enregistré dans le fichier du projet, en ajoutant automatique le ".txt" a la fin du nom entré par l'utilisateur.