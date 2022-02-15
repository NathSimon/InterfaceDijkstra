# Explication de l'�x�cution du projet labyrinthe :

Projet de JAVA de premi�re ann�e

Nathana�l SIMON

Encadrant : Patrick Bellot - T�l�com Paris

Ce projet demande l'int�gration de l'algorithme de Djikstra dans une interface graphique, simple et intuitve pour l'utilisateur. D'autres fonctionnalit�s ont �t� impl�ment�es pour compl�menter le projet. Une attention particuli�re aux bonnes pratiques de programmation orient�e objet a �t� apport�e dans la r�alisation.

##Utilisation de l'interface graphique


###Utilisation principale

L'interface se divise en 3 parties. 

#### Paneau de contr�le
Paneau qui permet le contr�le de la plupart des fonctionnalit�s du labyrithe. 
##### Boutons de s�l�ction
S�lection des diff�rents types de blocs. Il est possible de s�l�ctionner le d�part, l'arriv�e, et les murs. Le bouton mur permet d'ajouter, ou d'enlever un mur en cliquant. Une seule arriv�e et un seul d�part sont autoris�e dans le labyrithe. Un indicateur du boutton s�l�ctionn� est affich�.
##### S�l�ction de la taille du labyrinthe
Champs de textes permettant d'entrer la taille du labyrinthe souhait�e. Celle ci doit �tre comprise en 4 et 100 pour des raisons arbitraire de facilit� d'utilisation. Un changement de taille se fait par la pr�ssion de la touche entr�e apr�s avoir s�l�ctionn� la nouvelle taille, et remet l'enti�ret� du labyrinthe dans sa configuration initiale. 

Deux types d'erreurs sont g�n�r�s. 

Input size : la taille entr�e n'est pas comprise entre 4 et 100.

Input format : la taille entr�e poss�de des caract�res qui ne sont pas de chiffres. ATTENTION, les espaces g�n�rent cette erreur.
##### Boutton de switch
Ces deux boutton sont alternantifs � chaque clique sur l'un deux. 

AUTO/MANUAL : Permet de changer le mode de r�solution du labyrinthe. Automatique = R�solution � chaque modification du labyrinthe, mur, d�part, ou arriv�. Manuel = r�solution du labyrinthe � chaque pression du boutton "solve". 

Ces modes permettent une facilit� d'utilisation dans les labyrinthes de petite taille, et en mode manuel dans les labyrinthes de grande taille.

Color : Permet de changer la couleur des bordures des cases du labyrinthe. Cela peut permettre d'aider � la lisibilit� du labyrinthe pour certains utilisateurs.

Ces deux bouttons  poss�dent des indicateurs textuels expicatifs pour l'utilisateur.

##### Solve/Reset
Solve : boutton permettant de r�soudre le labyrinthe. G�n�re des erreurs si il n'y a pas d'arriv�e ou de d�part, ou si il n'existe pas de r�solution du labyrinthe, et en informe l'utilisateur. 

Reset : boutton permettant de r�initialis� le labyrinthe aux dimensions actuellements s�l�ctionn�es par l'utilisateur. Demande la confirmation de l'utilisateur avant de s'effectuer.

#### Paneau central

Affichage du labyrinthe. En fonction du type de case s�lectionn�, affichage d'un mur, d'herbes ou de textes d�part / arriv�. Le chemin r�alis� par le labyrinthe est affich� en rouge entre les points de d�part et d'arriv�s.

#### Menus d�roulants
Ces menus d�roulants permettent d'acceder � d'autres fonctionnalit�s, r�pertori�es par cat�gories.

##### File
Import from file : D�scription � la fin de ce document.

Save to file : D�scription � la fin de ce document.

Quit : Ferme l'application.

##### Maze
Put every box to wall : permet de changer toutes les cases du labyrinthe en mur.

Put every box to empty : permet de changer toutes les cases du labyrinthe en chemin possible.

Solve : Boutton fonctionnant de la m�me fa�on que celui du panneau de contr�le.

Reset : Boutton fonctionnant de la m�me fa�on que celui du panneau de contr�le.

##### Display
Switch border color to : Boutton fonctionnant de la m�me fa�on que celui du panneau de contr�le.

Minimize : Minimise la taille d'affichage de l'application vers une valeur pr�d�finie.

Maximize : Maximise la taille d'affichage de l'applcation en plein �cran. 

##Import from file

G�n�ration d'une fenetre permettant l'importation d'un l'labyrinthe d�j� fait.

### Input

Le programme accepte un fichier au format .txt . Le labyrinthe sera d�crit comme un bloc rectangulaire uniquement. Les seuls caract�res autoris�s sont les suivants. 

Le fichier doit �tre OBLIGATOIREMENT positionn� dans le fichier du projet. 
Il est ensuite possible d'entrer le nom du fichier. Le programme g�n�re une erreur si il ne trouve pas le fichier.

### Types de case

- W : case de mur
- E : case vide
- D : case de d�part. Il ne peut en avoir qu'une.
- A : case d'arriv�e. Il ne peut en avoir qu'une.

### Erreurs possibles 
Le programme g�n�re les erreurs en fonction du fichier texte fourni, et reprends celles demand�es lors des TPs.

Erreur de taille/de nombre d'entr�es sorties/de caract�re inconnu.

### Exemple de labyrinthe
`WWWWW`

`EDEEE`

`WWWWE`

`EEEEE`

`AEEEW`



##Save to file

G�n�ration d'une fenetre permettant l'exportation dans un fichier texte du labyrinthe affich�.

Le fichier sera enregistr� dans le fichier du projet, en ajoutant automatique le ".txt" a la fin du nom entr� par l'utilisateur.